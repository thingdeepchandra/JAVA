import java.util.Scanner;

public class d_area_of_traingle {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the breadth of a traingle:");
int b=sc.nextInt();
System.out.println("Enter the height of a traingle:");
int h=sc.nextInt();
int area=(1/2)*b*h;
System.out.println("The area oa a traingle is:"+area);
sc.close();
}    
}
