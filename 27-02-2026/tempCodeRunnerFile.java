 import java.util.Scanner;
public class user_input {
   
    public static void main(String[] args) {
        System.out.println("Enter  the number to print in scanner class");
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            System.out.println("The number you entered is: " + a);
        }
    }
}
