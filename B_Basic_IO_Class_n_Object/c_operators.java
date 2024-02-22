package B_Basic_IO_Class_n_Object;

public class c_operators {
    int a=10, b=3;
    int sum=a+b;
    int sub=a-b;
    int quo=a/b;
    int modu=a%b;
    int prod=a*b;

    public static void main(String[] args) {
        c_operators  obj = new c_operators();
        System.out.println("The sum is ="+obj.sum);
        System.out.println("The difference  is ="+obj.sub);
        System.out.println("The qoutient is ="+obj.quo);
        System.out.println("The modulus is ="+obj.modu);
        System.out.println("The product is ="+obj.prod);
    }
}
