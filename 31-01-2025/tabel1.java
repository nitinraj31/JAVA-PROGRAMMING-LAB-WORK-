

public class tabel1 {
    public static void main(String[] args) {
        // print multiplication table of a number using while loop
        int i;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number for multiplication table:");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of " + n + ":");
        i = 1;
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }
        sc.close();
    }
}
