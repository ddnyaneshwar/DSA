package slidingwindow;

public class LongestSubstringWithoutDuplicate {
    public static void main(String[] args) {
        String str= "abcads";
        int maxLength = 0;
        int left = 0;
        int right = 0;
        for (; right < str.length(); right++) {
            char current = str.charAt(right);
            int index=str.indexOf(current,left);
            if(index<right){
                left=index+1;
            }
            maxLength= Math.max(maxLength,right-left+1);
        }
        System.out.println(maxLength);
    }
}
