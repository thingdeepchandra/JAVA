import java.util.Scanner;

public class l_volume_of_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a cube:");
        int l=sc.nextInt();
        int volume=(int)Math.pow(l, 3) ;
        System.out.println("The volume of a cube is :"+volume);   
        sc.close();
    }
    
}
