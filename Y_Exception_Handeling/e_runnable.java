package Y_Exception_Handeling;
class meroThread implements Runnable {
    public void run() {
        System.out.println("My thread is running.");
    }
}

public class e_runnable {
    public static void main(String[] args) {
        myThread mt = new myThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
