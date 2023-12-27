package day14.jva8.thread;

class Naturals extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

class Evens extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + " - " + (i*2));
        }
    }
}

public class ThreadTest3 {
    public static void main (String[] args) {
        Thread nat = new Naturals();
        Thread even = new Evens();

        nat.setName("NATURAL ");
        even.setName("EVEN ");

        nat.start();
        even.start();
    }
}
