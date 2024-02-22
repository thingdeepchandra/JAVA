package S_Inheritance;

class Grandpa{
    public void grand(){
        System.out.println("Hello, Grandpa");
    }
}
class Father extends Grandpa{
    public void dad()
    {
        System.out.println("Hello, dad");
    }
}
class Son extends Father{
  public void child()
  {
    System.out.println("Greeting from your child.");
  }
}
public class b_multilevel{
    public static void main(String[] args) {
        Son s1=new Son();
        s1.grand();
        s1.dad();
        s1.child();
    }
}
