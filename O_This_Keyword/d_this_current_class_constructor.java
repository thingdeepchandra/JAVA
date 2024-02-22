package O_This_Keyword;
class Calc{
    Calc()
    {
        this(45);
        System.out.println("Default constructor invoked");
    }
    Calc(int a)
 {
    System.out.println("The value ="+a);
 }
}

public class d_this_current_class_constructor {
    public static void main(String[] args) {
     new Calc(45);
    // Calc c1=new Calc();   
    }   
}
