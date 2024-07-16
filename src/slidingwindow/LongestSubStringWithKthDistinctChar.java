package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKthDistinctChar {
    //Find longest sub-string length with K distinct characters
    /*
    https://medium.com/techie-delight/top-problems-on-sliding-window-technique-8e63f1e2b1fa
    For example, consider string abcbdbdbbdcdabd.

    For k = 2, o/p is ‘bdbdbbd’ length=7
    For k = 3, o/p is ‘bcbdbdbbdcd’ length 11
    For k = 5, o/p is ‘abcbdbdbbdcdabd’ lenght
     */

    public static void main(String[] args) {
        String str="abcbdbdbbdcdabd";
        int k=5;
        int result=findLongestSubString(str,k);
        System.out.println(result);
    }

    private static int findLongestSubString(String str, int k) {
        if(str==null || str.isEmpty() || k<=0 || k>str.length()) return -1;

        int n=str.length();
        int left = 0,right=0;
        int maxLenght=-1;
        Map<Character,Integer> charCountMap=new HashMap<>();

        while(right<n){
            char rightChar=str.charAt(right);
            charCountMap.put(rightChar,charCountMap.getOrDefault(rightChar,0)+1);

            while (charCountMap.size()>k){
                char leftChar=str.charAt(left);
                charCountMap.put(leftChar,charCountMap.getOrDefault(leftChar,0)-1);
                if (charCountMap.get(leftChar)==0){
                    charCountMap.remove(leftChar);
                }
                left++;
            }
            maxLenght=Math.max(maxLenght,right-left+1);
            right++;
        }
        return maxLenght;
    }


}
