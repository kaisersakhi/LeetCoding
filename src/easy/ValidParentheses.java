package easy;


//https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

/**
 *Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *     Every close bracket has a corresponding open bracket of the same type
 *
 * Constraints:
 *
 *     1 <= s.length <= 104
 *     s consists of parentheses only '()[]{}'.
 *
 *     (({{{[][]}}}))
 */

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("()]"));
    }

    boolean isValid(String s){
        if (s.length() % 2 != 0) return false;
        char[] stack = new char[s.length()];
        int stackPointer = -1;
        char x;
        for (int i = 0; i < s.length(); ++i){
            x = s.charAt(i);
            if (x == '(' || x== '[' || x == '{'){
                stack[++stackPointer] = x;
                continue;
            }
            if (stackPointer < 0) return false;
            if (getOpposite(x) != stack[stackPointer--]){
                return false;
            }
        }
        return stackPointer == -1;
    }

    public boolean isValid1(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        char x;
        char popped;
        for (int i = 0; i < s.length(); ++i){
            x = s.charAt(i);
            if (x == '(' || x== '[' || x == '{'){
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) return false;
            popped = stack.pop();

            if (getOpposite(x) != popped){
                return false;
            }
        }
        return true;
    }
    char getOpposite(char x){
        switch (x) {
            case ']' -> {
                return '[';
            }
            case ')' -> {
                return '(';
            }
            case '}' -> {
                return '{';
            }
        }
        return x;
    }
}
