import java.util.Scanner;

public class u_swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt(); 

        int temp;
        // value of first is assigned to temp
        temp=a;
        //value of second is assigned to first
        a=b;
        //value of temp is assigned to second
        b=temp;
        System.out.println("Display number by swapping.");
        System.out.println("After swapping, firsts number ="+a);
         System.out.println("After swapping, second  number ="+b);
        sc.close();
    }
    
}
