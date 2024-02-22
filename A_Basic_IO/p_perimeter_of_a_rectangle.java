import java.util.Scanner;

public class p_perimeter_of_a_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle:");
        int l=sc.nextInt();
        System.out.println("Ebter theh breadth of a rectangle:");
        int b=sc.nextInt();
        int p=2*(l+b);
        System.out.println("The perimeter ifa rectangle is ="+p);
        sc.close();
        }
    
}
