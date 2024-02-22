package T_Polymorphism.Method_Overriding;

class GrandPa {
    void Hello() {
        System.out.println("Hello from GrandPa.");
    }
}

class Dad extends GrandPa {
    void Hello() {
        System.out.println("Hello from Dad.");
    }
}

class Child extends Dad {
    void Hello() {
        System.out.println("Hello from Child.");
    }
}

public class b_method_overriding {
    public static void main(String[] args) {
        GrandPa a, b, c;
        a = new GrandPa();
        b = new Dad();
        c = new Child();

        a.Hello();
        b.Hello();
        c.Hello();
    }
}
