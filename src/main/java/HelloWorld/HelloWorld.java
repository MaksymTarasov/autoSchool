import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, world!");

        printHelloName();
    }

    public static void printHelloName() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, be so kind to enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
