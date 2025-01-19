package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=8;
        int my=k%arr.length;
        System.out.println("rotating for :"+my);
        LinkedList<Integer> intLink = Arrays.stream(arr).boxed().collect(Collectors.toCollection(LinkedList::new));

        while(k-->0){
            intLink.addFirst(intLink.pollLast());
        }

        System.out.println(intLink);
    }
}
