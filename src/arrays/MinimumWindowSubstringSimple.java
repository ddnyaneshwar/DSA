package arrays;

import java.util.Arrays;

public class MinimumWindowSubstringSimple {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] target = new int[128];
        for (char c : t.toCharArray()) {
            target[c]++;
        }

        System.out.println(Arrays.toString(target));

        int left = 0, right = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        int count = t.length();

        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (target[rChar] > 0) {
                count--;
            }
            target[rChar]--;
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }

                char lChar = s.charAt(left);
                target[lChar]++;
                if (target[lChar] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        MinimumWindowSubstringSimple solution = new MinimumWindowSubstringSimple();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC")); // Output: "BANC"
        System.out.println(solution.minWindow("a", "a"));                // Output: "a"
    }
}
