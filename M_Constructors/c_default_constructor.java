 package M_Constructors;

public class c_default_constructor {
    int roll;
    String name;

    c_default_constructor() {
        roll = 45;
        name = "Ram";
    }

    void display() {
        System.out.println("Roll no = " + roll);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        c_default_constructor obj = new c_default_constructor();
        obj.display();
    }
}