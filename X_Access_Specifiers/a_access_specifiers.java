package X_Access_Specifiers;

class Student{
    //private int roll =34;
    public int roll =34;
}


public class a_access_specifiers {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println("Roll no of student ="+ s1.roll);
    }
    
}
