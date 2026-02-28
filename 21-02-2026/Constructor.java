// write a program to demonstrate the use of constructor in java
public class Constructor {  
    int id;
    String name;

    // Constructor
    Constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(1, "gecwc");
        Constructor obj2 = new Constructor(2, "nitin");

        obj1.display();
        obj2.display();
    }
}