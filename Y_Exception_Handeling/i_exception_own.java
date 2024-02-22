package Y_Exception_Handeling;
class Myexception extends Exception
public Myexception(Srting s)
{
    super(s);
}

public class i_exception_own {
    public static void main(String[] args) {
        try {
            throw new Myexception("Exception Thrown");
        } catch (Exception ex) {
            // TODO: handle exception
            System.out.println("Exception caught");
        }
    }
    
}
