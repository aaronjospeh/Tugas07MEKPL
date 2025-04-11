import java.util.Scanner;

public class HelloNameModular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        greet(name);

        scanner.close();
    }

    // Method to print greeting
    public static void greet(String name) {
        System.out.println("Hello, \"" + name + "\"");
    }
}
