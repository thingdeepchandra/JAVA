package Y_Exception_Handeling;

class One extends Thread
{
    public void run()
    {
        for (int i=0; i<25; i++)
        {
        System.out.println("hi");
        }
    }
}
class Two extends Thread
{
    public void run()
    {
        for (int i=0; i<25; i++)
        {
        System.out.println("hello");
        }
    }

}

public class b_thread {
    public static void main(String[] args) {
        One obj1=new One();
        Two obj2=new Two(); 
        obj1.run();;
        obj2.run();
        
    }
    
}
