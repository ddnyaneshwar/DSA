package slidingwindow;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int maxLength=0;

        for(int right=0;right<s.length();right++){

            char currentChar = s.charAt(right);
            int currentCharIndex=s.indexOf(currentChar,left);
            if(currentCharIndex<right){
                left=currentCharIndex+1;
            }
            maxLength=Math.max(right-left+1 , maxLength);
        }
        return maxLength;
    }
}



















