package O_This_Keyword;
class Teacher{
    void h1()
    {
        System.out.println("Hello Sanothimi");
    }
    void hello()
    {
        System.out.println("Hi Sanothini");
        this.hello();
    }
}

public class b_this_current_class_method {
    public static void main(String[] args) {
     Teacher t1=new Teacher();
     t1.hello();   
    }
    
}
