import java.lang.Math;
public class quad {
    public static void  main(String args[])
    {
        int a = 2, b = 8, c = 8, d;
        double x1, x2;
        d = b * b - 4 * a * c;
        if (d >= 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);

        }
        else {
            System.out.println("Roots aree not valid");
        }
        


    }
}