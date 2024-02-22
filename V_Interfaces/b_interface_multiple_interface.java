package V_Interfaces;

interface ITeacher{
    public void teach();
}
interface IStudent{
    public void learn();
}
class College implements ITeacher, IStudent
{
    @Override
    public void teach()
    {
        System.out.println("Teacher is teaching");
    
    }

    @Override
    public void learn() {
         System.out.println("Student is leraning"); 
    }
}

public class b_interface_multiple_interface {
    public static void main(String[] args) {
        College cl=new College();
        cl.teach();
        cl.learn();
    }
    
}
