import java.util.Scanner;

public class c_area_of_rectaingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectaingle:");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of rectaingle:");
        int b=sc.nextInt();
        int area= l*b;
        
        System.out.println("The area of rectaingle is="+area);
        sc.close();

    }
    
}
