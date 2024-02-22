
//How to get priority in java
package Y_Exception_Handeling;
class ThreadDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class f_thread_get_priority {
    public static void main(String[] args) {
        /*
         * f_thread_get_priority tp =new f_thread_get_priority();
         * Thread t1 = new Thread("Hello");
         * System.out.println("Thread Priority = "+t1.getPriority());
         * System.out.println("Thread Name = "+t1.getName());
         * t1.start();
         */
        ThreadDemo tp = new ThreadDemo();
        Thread t1 = new Thread(tp, "Hello , Ram");
        Thread t2 = new Thread(tp, "Hello, Sita");
        Thread t3 = new Thread(tp, "Hello, Hari");

        t1.setPriority(3);
        t2.setPriority(4);
        t3.setPriority(1);

    }

}
