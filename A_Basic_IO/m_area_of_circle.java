import java.util.Scanner;

public class m_area_of_circle {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the radious of a circle");
    int r=sc.nextInt();
    int area=(int)3.14* r*r;
    //int area=(int)3.14 * Math.pow(r,2 )
    System.out.println("The ara of a circle is ="+area);
    sc.close(); 
    
        
}    
}
