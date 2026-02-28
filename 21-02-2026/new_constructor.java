// This program demonstrates the use of a constructor in Java to initialize object properties.
//Student name and roll number and for college students .
public class new_constructor {
    int roll;
    String name;
    String college;

    // Constructor
    new_constructor(int roll, String name, String college) {
        this.roll = roll;
        this.name = name;
        this.college = college;

    }

    public void display() {
        System.out.println("ID: " + roll);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        new_constructor obj1 =new new_constructor(1, "babli", "gecwc");
        new_constructor obj2 =new new_constructor(2, "nitin", "gecwc");
        new_constructor obj3 =new new_constructor(3, "nishant", "gecwc");

        obj1.display();
        obj2.display();
        obj3.display();
    }