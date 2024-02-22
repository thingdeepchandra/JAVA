import java.util.Scanner;

public class k_volume_of_a_cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of a cuboid:");
        int h=sc.nextInt();
        System.out.print("Enter the breadth of a cuboid:");
        int b=sc.nextInt();
        System.out.print("Ente the length of a cuboid:");
        int l=sc.nextInt();
        int volume = l*b*h;
        System.out.println("The volumem f a cuboid is ="+volume );



        sc.close();
    }
    
}
