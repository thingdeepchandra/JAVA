package V_Interfaces;
interface IFather{
    public void teaching();
}
interface IMother{
    public void feeding();
}
class Home{
    public void sheltering(){
        System.out.println(" Home is beautiful.");
    }
}
public class c_interface_noninterface extends Home implements IFather, IMother{
    public static void main(String[] args) {
        c_interface_noninterface obj =new c_interface_noninterface();
        obj.teaching();
        obj.feeding();
        obj.sheltering();
    }


    @Override
    public void teaching() {
        System.out.println("Father is teaching");
    }

    @Override
    public void feeding() {
        System.out.println("Father is teaching");
    }
}

 
 
