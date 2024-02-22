package V_Interfaces;
interface College{
    public void study();
}

class Student implements College{

    @Override
    public void study() {
       System.out.println("We are studying..........."); 
     }

}

public class a_interface {
public static void main(String[] args) {
    Student s1=new Student();
    s1.study();
  }  
}
