package Stacks;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
//       int res= maxDepth("(((8)/4))");
//        System.out.println(res);
        int x = 3;
        float y = x;
        System.out.println(y/3);

    }
    public static int maxDepth(String s) {
        int depth = Integer.MIN_VALUE;
        Stack<Character> stack = new Stack<>();
        int charC= 0 , maxDep = 0;
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                stack.push('(');
                charC = 0;
            }
            if(s.charAt(i) == ')'){
                if(charC > 1){
                    maxDep++;
                }
                stack.pop();
            }
            charC++;

        }
        System.out.println(stack);
        return maxDep;
    }
}
