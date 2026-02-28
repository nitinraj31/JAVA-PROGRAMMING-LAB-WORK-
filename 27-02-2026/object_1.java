public class object_1 {
    public static void main(String[] args) {
        System.out.println("Enter any number to print using scanner class");
        try (java.util.Scanner obj = new java.util.Scanner(System.in)) {
            int a = obj.nextInt();
            System.out.println("The number you entered is: " + a);
        }
    }
}
