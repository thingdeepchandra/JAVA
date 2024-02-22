package P_Static_Fields_Methods;

class Student{
    int roll;
    String name;
    static String clzName="Sanothimi";

    void input(int r,String n)
    {
        roll=r;
        name=n;
    }

void output()
{
System.out.println("Roll =" +roll);
System.out.println("Name =" +name);
System.out.println("College name= "+clzName);
}
}
public class a_static_fields {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3= new Student();
        s1.input(12, "Ram");
        s2.input(13, "Sita");
        s3.input(14, "Gita");
        s1.output();
        System.out.println();
        Student.clzName="Bhatapur";
        s2.output();
        System.out.println();
        s3.output();
    } 
}
