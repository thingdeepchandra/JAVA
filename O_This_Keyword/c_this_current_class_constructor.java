package O_This_Keyword;
class Nums{
    Nums()
    {
        System.out.println("Default constructo invoked.");
    }
   
    Nums(int a)
    {
        this();
        System.out.println("The value is ="+a);
    }
}
public class c_this_current_class_constructor {
    public static void main(String[] args) {
        new Nums(34);
       // Nums n1=new Nums(90);
        
    }
    
}
