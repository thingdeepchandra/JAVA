package O_This_Keyword;

class Student{
    int roll;
    String name;
    float marks;
    
    Student (int roll,String name,float marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
 
   }
   void displaydetails(){
    System.out.println("\n Roll no. of student ="+roll);
    System.out.println("The name of student is ="+name);
    System.out.println("The narks obtained by student is ="+marks);
   }
}
public class a_this {
    public static void main(String[] args) {
        
        Student s1=new Student(1, "Rohan", 67.67f);
        Student s2=new Student(2, "Ronisha", 68.89f);
        s1.displaydetails();
        s2.displaydetails(); 
    }
    
}
