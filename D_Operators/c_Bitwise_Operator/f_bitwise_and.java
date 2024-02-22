package D_Operators.c_Bitwise_Operator;

import java.util.Scanner;

public class f_bitwise_and {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int c=a&b;
        System.out.println("The value of c="+c);
        sc.close();
    }
    
}
