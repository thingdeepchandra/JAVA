import java.util.Scanner;

public class s_convet_celsius_int_fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tempeature in celsius:");
        double cel=sc.nextDouble();
        double fah=(9.0/5.0)*cel+32;
        System.out.println("The conversion temperature in fahrenight is="+fah);
        sc.close();
    }
    
}
