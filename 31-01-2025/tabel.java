

public class tabel {
    public static void main(String[] args) {
        int i;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number for multiplication table:");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of " + n + ":");
        for(i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
