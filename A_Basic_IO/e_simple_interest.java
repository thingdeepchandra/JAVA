import java.util.Scanner;

public class e_simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p=sc.nextInt();
        System.out.println("Enter the time of a amount:");
        int t=sc.nextInt();
        System.out.println("Enter the rate of a amount:");
        int r=sc.nextInt();
        int si=(p*t*r)/100;
        System.out.println("The simple interest is ="+si+"rs") ;
        sc.close();
    }
    
}
