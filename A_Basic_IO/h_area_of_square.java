import java.util.Scanner;

public class h_area_of_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the length of a square:");
        int length=sc.nextInt();
       // int area  =length * length;
        int area=(int)Math.pow(length, 2);
        System.out.println("The area of square is :"+area +"ut.cb") ;
        sc.close();
    }
    
}
