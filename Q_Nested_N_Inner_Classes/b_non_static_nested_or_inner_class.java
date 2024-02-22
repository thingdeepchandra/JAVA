package Q_Nested_N_Inner_Classes;


class Outerclass{
    public void Display(){
        Innerclass in =new Innerclass();
        in.show();
    }
    class Innerclass{
        public void show(){
            System.out.println("This is the method within inner class.");
        }
    }
}

public class b_non_static_nested_or_inner_class {
    public static void main(String[] args) {
        Outerclass obj=new Outerclass();
        obj.Display();
    }
}
