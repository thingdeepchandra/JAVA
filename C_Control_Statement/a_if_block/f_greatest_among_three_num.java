package C_Control_Statement.a_if_block;
import java.util.Scanner;

public class f_greatest_among_three_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
        if(a>b&& a>c){
            System.out.println("The number "+a+" is a greater than "+b+" and "+c+".");
        } 
        else if(b>c && b>a){
        System.out.println("The number "+b+" is a greatest number among three number");
            }  
           else{
            System.out.println("The number "+c+" is a greatest number among three bnumber.");
           }  
        sc.close();
    }
}
