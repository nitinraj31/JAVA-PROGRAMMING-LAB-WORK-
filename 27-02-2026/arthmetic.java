import java.util.Scanner;
class arthmetic {
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        try 
        (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            System.out.println("Enter the second number:");
            int b = obj.nextInt();
            int sum = a + b;
            int difference = a - b;
            int product = a * b;
            double quotient = (double) a / b;
            System.out.println("The sum of " + a + " and " + b + " is: " + sum);
            System.out.println("The difference of " + a + " and " + b + " is: " + difference);
            System.out.println("The product of " + a + " and " + b + " is: " + product);
            System.out.println("The quotient of " + a + " and " + b + " is: " + quotient);
        }
    }
}


// Scanner obj = new scanner(system.in);
// int a =obj.nextInt();
// int b =obj.nextInt();
