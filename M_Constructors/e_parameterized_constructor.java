 package M_Constructors;

public class e_parameterized_constructor {
    int roll;
    String name;

    e_parameterized_constructor(int r, String n) {
        roll = r;
        name = n;
    }

    void output() {
        System.out.println("\nRoll No = " + roll);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        e_parameterized_constructor s1 = new e_parameterized_constructor(11, "Ram");
        e_parameterized_constructor s2 = new e_parameterized_constructor(34, "Sita");
        s1.output();
        s2.output();
    }
}