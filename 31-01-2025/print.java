import java.util.*;
public class print {
    public static void main(String[] args) {
      System.out.println("Enter the number to print rows in stars");
        int n= new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println(); // Move to the next line after each row
        }
        
    }
}
