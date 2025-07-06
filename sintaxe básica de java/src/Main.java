import java.util.Scanner;

public class Main {

    private final static String WELWOME_MESSAGE = "Olá, informe seu nome:";

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        var scanner = new Scanner(System.in);

        // System.out.println("Informe seu nome:");
        System.out.println(WELWOME_MESSAGE);

        // String name = scanner.next();
        var name = scanner.next();

        System.out.println("Informe sua idade");

        // int age = scanner.nextInt();
        var age = scanner.nextInt();

        // System.out.println("Olá " + name + " sua idade é " + age);
        System.out.printf("Olá %s sua idade é %s\n", name, age);
    }
}
