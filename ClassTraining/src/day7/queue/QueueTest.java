package day7;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main (String[] args) {

        Queue<Integer> q = new PriorityQueue<>();
        //System.out.println(q.remove()); //java.uti;.ElementException
        //System.out.println(q.poll()); //null

        for(int i=10; i>0; i--){
            q.add(i);
        }

        System.out.println(q);
        System.out.println(" ----> " +q.poll());

        System.out.println(q);
        System.out.println(" ----> " +q.poll());

        for(int i=0; i<= 10; i++){
            Integer c = q.poll();
            System.out.print(c +"   ");
        }
    }
}
