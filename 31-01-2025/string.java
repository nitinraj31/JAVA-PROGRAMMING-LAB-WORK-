
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String n;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string ");
            n = input.nextLine();
            System.out.println("user entered string is " + n);
        }    }
}