package blind75;

// https://github.com/cherryljr/LeetCode/blob/master/Valid%20Anagram.java
public class ValidAnagram {
    public static void main(String[] args) {
        String str1="madam";
        String str2="madam";
        boolean isAnagram=isAnagram(str1,str2);
        System.out.println("String is Anagram->"+isAnagram);
    }

    private static boolean isAnagram(String str1,String str2) {
        if (str1.length()!=str2.length())return false;
        int[] alphabet=new int[26];
        for (int i=0;i<str1.length();i++){
         alphabet[str1.charAt(i)-'a']++;
        }
        for (int i=0;i<str2.length();i++){
            alphabet[str2.charAt(i)-'a']--;
        }
        for (int i : alphabet) {
            if (i!=0) return false;
        }
        return true;
    }
}
