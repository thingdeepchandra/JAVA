package D_Operators.c_Bitwise_Operator;

import java.util.Scanner;

public class h_bitwise_xor {
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int c=a^b;
        int d=a|b;
        int e=a & b;
        int f= ~a;
        System.out.println("The value of f ="+f);
        System.out.println("The value of e="+e);
        System.out.println("The value of d="+d);
        System.out.println("The value of c="+c);
        sc.close();
    
}
}
