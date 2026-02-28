public class copy_constructor {
 int id;
    String name;

    // Constructor
    copy_constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    copy_constructor(copy_constructor obj) {
        this.roll = obj.roll;
        this.name = obj.name;
    }

    public void display() {
        System.out.println("ID: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        copy_constructor obj1 = new copy_constructor(512, "nitin ");
        copy_constructor obj2 = new copy_constructor(obj1); // Using copy constructor

        obj1.display();
        obj2.display();
    }
}
