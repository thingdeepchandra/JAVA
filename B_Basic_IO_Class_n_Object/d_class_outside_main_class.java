package B_Basic_IO_Class_n_Object;

class Student {
    int roll=5;
    String name ="Deepchandra Thing";
    String campus="Sanothimi campus";
}
public class d_class_outside_main_class {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println("Roll no="+s1.roll);
        System.out.println("Name is ="+s1.name);
        System.out.println("I study in "+s1.campus);
    }
    
}
