package D_Operators.d_Logical_Operator;

import java.util.Scanner;
public class logical_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
       
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // use of Logical NOT
        System.out.println("!(a<b) = " + !(a<b));
        System.out.println("!(a>b) = " + !(a>b));
         sc.close();

    }
}