package U_Final_Keyword;
     class Mom{
        //final pub;ic void for cooking
        public void cooking()
        {
            System.out.println("Mom is cooking meal.");
        }
    }
    class Daughter extends Mom{
        //@Override
        public void cooking()
        {
            System.out.println("Papa ki pari is cooking meal.");
        }
    }
public class c_final_method{
    public static void main(String[] args) {
        Daughter keti =new Daughter();
        keti.cooking();
    }
}
