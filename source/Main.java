import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
     static String answers = "";

    public static void main(String[] args) {
        String name = hello();
        int  age = age();
        int num = count();
        test();
        ansear();
        saveUser (name,age, num);
    }

    public static String hello() {
        System.out.println("Hello! My name is Aid.\n" +
                "I was created in 2020.\n" + "Please, remind me your name.");
        String name = scanner.next();
        System.out.println("What a great name you have, " + name + "!");

        return name;

    }

    public static int age() {
        System.out.println("Let me guess your age.\n" +
                "Enter the remainders of dividing your age by 3, 5 and 7.");
        int ost1 = scanner.nextInt();
        int ost2 = scanner.nextInt();
        int ost3 = scanner.nextInt();
        int hu = agge(ost1, ost2, ost3);
        System.out.println("Your age is " + hu + ": that's a good time to start programming!");

        return hu;
    }

    public static int count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int a = scanner.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.println(i + "!");

        }
        return a;
    }

    public static void test() {
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
    }

    public  static void ansear() {
        int b = scanner.nextInt();
        if (b != 2) {
            System.out.println("Please, try again.");
            answers = answers + b + ",";
            ansear();
        } else {
            System.out.println("Congratulations, have a nice day!");
            answers = answers + b + ".";
        }

    }

    public static int agge(int ost1, int ost2, int ost3) {
        int a = (ost1 * 70 + ost2 * 21 + ost3 * 15) % 105;
        return a;
    }

    private static void saveUser(String name, int age, int num) {
        try (FileWriter writer = new FileWriter("users.txt", true)) {
            // запись всей строки
            String text = "Новый пользователь:\n" +
                    String.format("Имя: %s\n", name) +
                    String.format("Возраст: %s\n", age) +
                    String.format("Число: %s\n", num) +
                    String.format("Ответы: %s\n", answers) +
                    "-----------------------------------\n";
            writer.write(text);

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}










