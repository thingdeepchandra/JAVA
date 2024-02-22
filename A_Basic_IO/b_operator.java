import java.util.Scanner;

public class b_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int sum=a+b;
        int product=a*b;
        int quotient=a/b;
        int remainder=a%b;
        int sub=a-b;
        System.out.println("The sum is ="+sum);
        System.out.println("The sum is ="+sub);
        System.out.println("The product is="+product);
        System.out.println("The quotirnt is ="+quotient);
        System.out.println("The remainder is ="+remainder);
        sc.close();

    }
    
}
