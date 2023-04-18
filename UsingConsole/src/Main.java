// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello World");


        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        boolean flag = true;
        int count = 0;

        do
        {
            if(count <= 5){
                System.out.println("The count is " + count);
                count++;
            }
            if (count == 6){ flag = false; }
        }
            while(flag);

    }
}