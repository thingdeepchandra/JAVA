import java.util.Scanner;

public class n_convert_age_into_days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        int days=age*365;
        System.out.println("Conversion of your age into days is :"+days);
        sc.close();

        
        
    }
    
}
