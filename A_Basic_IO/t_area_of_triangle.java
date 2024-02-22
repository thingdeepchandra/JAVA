import java.util.Scanner;

public class t_area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a triangle:");
        float h = sc.nextFloat();
        System.out.println("Enter teh breadth of a triangle:");
        float b = sc.nextFloat();
        float a = 1 / 2 * b * h;
        System.out.println("The area of traiangle is=-" + a);
        sc.close();
    }

}
