import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an Object of Console class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Printing 5 Times:");
        for (int i = 0; i < 5; i++){
            System.out.print(name + " ");
        }


    }
}