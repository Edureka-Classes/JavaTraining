package day14;

public class MainThreadTest {
    public static void main (String[] args) {
        int noOfThreads = Thread.activeCount();
        System.out.println("No. of active threads = " +noOfThreads);

        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println("Name = " +t.getName());
        System.out.println("Priority = " + t.getPriority());

        ThreadGroup tgp = t.getThreadGroup();
        System.out.println(tgp);

        t.setName("Edureka");
        t.setPriority(10);
//        t.setPriority(11); //will generate java.lang.IllegalArgumentException max priority is 10
        System.out.println(t);
    }
}
