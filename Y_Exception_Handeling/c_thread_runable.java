package Y_Exception_Handeling;
public class c_thread_runable implements Runnable {
    public static void main(String[] args) {
        Thread t1=new Thread("Ram");
        Thread t2=new Thread("Sita");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
