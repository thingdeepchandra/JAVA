package C_Control_Statement.a_if_block;
import java.util.Scanner;

public class h_nested_if_else {
    public static void main(String[] args){
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter a number to check +ve ,-ve or zero using nested if else:");
        int num=sc.nextInt();
        if(num!=0)        {
            if(num>0){
                System.out.println("The numer "+num+" is a +ve number.");
            }
            else{
                System.out.println("The number "+num+" is a -ve number.");
            }
        }
        else{
            System.out.println("The number is zero.");
        }
            sc.close();

    }
}
