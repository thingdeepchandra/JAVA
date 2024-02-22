import java.util.Scanner;

public class i_area_of_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a cube:");
        int length=sc.nextInt();
        //a=length =breadth=height
        int Tsarea= 6 * length * length ;
        System.out.println("The area of a cube is ="+Tsarea);
        sc.close();
        }
    
}
