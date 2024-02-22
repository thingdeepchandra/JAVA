import java.util.Scanner;

public class f_compound_interest {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the principal:");
    int p=sc.nextInt();
    System.out.println("Enter the time of a amount:");
    int t=sc.nextInt();
    System.out.println("Enter the rate of a amount:");
    int r=sc.nextInt();
    // yaha program mile pani output mildaina. logical problem occurs here, you have to do corrction
    double amount = p * Math.pow((1 + r / 100) , t);
    System.out.println("The amount is ="+amount);
    double ci= amount-p;
    System.out.println("The ci of principal is ="+ci);
     
    sc.close();
    }
    
}
