
import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();
        
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;
        
        System.out.println("Integer part: " + integerPart);
        System.out.println("Fractional part: " + fractionalPart);
        
        scanner.close();
    }
}
