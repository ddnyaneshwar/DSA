package backtracking;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    public static void main(String[] args) {
        String str="ABC";
        findPermutation(str,"");
    }

    private static void findPermutation(String str, String s) {

        if(str.length()==0){
            System.out.println(s);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar=str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            findPermutation(left+right,s+currentChar);
        }

    }


}
/*
    private static Set<String> findPermutation(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = findPermutation(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }
    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    private static void findPermutation(String str, String ans) {
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char current=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            findPermutation(left+right, ans+current);
        }

    */

