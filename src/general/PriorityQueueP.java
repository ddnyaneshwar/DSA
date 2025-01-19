package general;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueP {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,7,9};

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i: arr){
            pq.add(i);
        }

        //System.out.println(arr);
        //System.out.println(Arrays.toString(pq.toArray()));

        for (int pqs : pq){
            System.out.println(pq.poll());
        }
    }
}
