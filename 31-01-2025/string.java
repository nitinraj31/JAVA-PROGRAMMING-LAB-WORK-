
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String n;
        String s;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string ");
            n = input.nextLine();
            System.out.println("Enter a sentence ");
            s = input.nextLine();
            System.out.println("user entered string is " + n);
            System.out.println("user entered sentence is " + s);
        }    }
}