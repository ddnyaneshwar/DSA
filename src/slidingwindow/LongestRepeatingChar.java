package slidingwindow;

public class LongestRepeatingChar {
    public static void main(String[] args) {
        String str= "ABAB";
        int k = 2;

        int[] freq = new int[26];
        int maxFreq= 0;
        int maxWindow=0;
        int left =0;
        int right =0;

        for(;right<str.length();right++){

            char current = str.charAt(right);
            freq[current-'A']++;
            maxFreq=Math.max(maxFreq,current-'A');
            int windowLength=right-left+1;


        }


    }
}
