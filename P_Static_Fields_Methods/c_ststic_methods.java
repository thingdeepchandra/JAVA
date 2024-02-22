package P_Static_Fields_Methods;

public class c_ststic_methods {
    //static variables
    static int clzId=27;
    static String clzname="Sanothimi";

    //static method
    static void staticMethod(){
        System.out.println("College Id ="+clzId);
        System.out.println("College name ="+ clzname);
    }
    //instance method
    void instanceMethod(){
        staticMethod();
    }
public static void main(String[] args) {
    c_ststic_methods obj = new c_ststic_methods();
    staticMethod();
    obj.instanceMethod();
   }   
}
