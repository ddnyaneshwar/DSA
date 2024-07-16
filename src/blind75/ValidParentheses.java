package blind75;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str="{]";
        boolean isValid=isValid(str);
        System.out.println(isValid);
    }

    private static boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        for (char c:str.toCharArray()){
            if (c=='{'|| c=='(' || c=='['){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return false;
                char topChar=stack.pop();
                if ( c=='}' && topChar!='{') return false;
                if ( c==']' && topChar!='[') return false;
                if ( c==')' && topChar!='(') return false;
            }
        }
        return true;
    }
}
