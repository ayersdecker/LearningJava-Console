import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String name = CollectName();
        System.out.println("Hello " + name +"! I'll show you the first twenty Fibonacci sequence numbers");
        printFibonacci();
    }
    private static String CollectName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
    private static void printFibonacci() {
        int n = 20;
        int first = 0;
        int second = 1;
        System.out.println("The first " + n + " Fibonacci numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }

}
