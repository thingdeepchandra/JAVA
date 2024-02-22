import java.util.Scanner;

public class q_operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Entet the value of b:");
        int b=sc.nextInt();
       
        int sum=a+b;
        int sub=a-b;
        int quo=a/b;
        int prod=a*b;
        System.out.println("The sum of "+a+ " and "+b+"  is ="+sum);
        System.out.println("The difference of "+a+ " and "+b+"  is ="+sub);
        System.out.println("The quotient of "+a+ " and "+b+"  is ="+quo);
        System.out.println("The product of "+a+ " and "+b+"  is ="+prod);
         sc.close();
    }
    
}
