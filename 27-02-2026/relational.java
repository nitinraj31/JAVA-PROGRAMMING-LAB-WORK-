import java.util.Scanner;
class relational {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter the first number:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter the second number:");
        b=obj.nextInt();
        System.out.println("greater than True /False  " + (a>b));
        System.out.println("less than True /False  " + (a<b));
        System.out.println("greater than or equal to True /False  " + (a>=b));
        System.out.println("less than or equal to True /False  " + (a<=b));
        System.out.println("equal to True /False  " + (a==b));
        System.out.println("not equal to True /False  " + (a!=b));
        
        
    }
    
}
