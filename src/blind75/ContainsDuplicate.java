package blind75;

import java.util.HashSet;
import java.util.Set;
// https://medium.com/techsoftware/contains-duplicate-leetcode-java-solution-de523269b436
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        boolean conatinsDuplicate=containsDuplicate(arr);
        System.out.println("Contains Duplicate:"+conatinsDuplicate);
    }

    private static boolean containsDuplicate(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (!set.add(arr[i])) return true;
        }
        return false;
    }
}
