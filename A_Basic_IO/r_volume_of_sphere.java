import java.util.Scanner;

public class r_volume_of_sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radioue of a sphere:");
        double r=sc.nextInt();
         double v=(4/3)*3.14*(Math.pow(r,3));
         double a=(4/3)*3.14*(Math.pow(r,2));
         System.out.println("The area of sphere is ="+a);
        System.out.println("The volumw of sphere is ="+v);
        sc.close();
    }
    
}
