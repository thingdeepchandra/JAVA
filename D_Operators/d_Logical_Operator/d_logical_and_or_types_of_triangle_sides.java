package D_Operators.d_Logical_Operator;

import java.util.Scanner;

public class d_logical_and_or_types_of_triangle_sides {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("In Triangle ABC");
        System.out.println("Enter length of side BC(a):");
        int a=sc.nextInt();
        System.out.println("Enter the length of side AC(b):");
        int b=sc.nextInt();
        System.out.println("Enter the length of side AB(c):");
        int c=sc.nextInt();

        if(a == b && b == c){
            System.out.println("Equilaterial Triangle.");
        }
        else if((a==b && b!=c) ||(b==c && c!=a)||(c==a && a!=b))
        {
            System.out.println("Isosceles triangle.");
        }
        else if(a!=b && b!=c && c!=a) {
            System.out.println("Scalane Triangle.");
        }
        else{
            System.out.println("Invalid Input.");//when ew nput angles =
        }
        sc.close();
    }  
}
    

