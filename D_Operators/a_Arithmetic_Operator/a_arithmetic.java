package D_Operators.a_Arithmetic_Operator;

import java.util.Scanner;

public class a_arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second  number:");
        int num2=sc.nextInt();

        System.out.println("Sum="+(num1+num2));
        System.out.println("Difference="+(num1-num2));
        System.out.println("Product="+(num1*num2));
        System.out.println("Quotient="+(num1/num2));
        System.out.println("Remainder="+(num1%num2));
        System.out.println("Exponential="+(int)Math.pow(num1, num2));
        sc.close();
    }
}
