package Stacks;

import java.util.Stack;

public class MakeValidParenthesis {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("(a(b(c)d)"));;
    }
    public static String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder br = new StringBuilder();
        br.append(s);
        int brIdx = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ')' && stack.isEmpty()){
                br.deleteCharAt(brIdx);
            }
            else if(s.charAt(i) == ')' && !stack.isEmpty()){
                stack.pop();
                brIdx++;
            }
            else if(s.charAt(i) == '('){
                stack.add(s.charAt(brIdx));
                brIdx++;
            }else{
                brIdx++;
            }
        }
        int curr = 0;
        while(!stack.isEmpty()){
            for(int i =0 ; i < br.length() ; i++){
                if(br.charAt(i) == '('){
                    br.deleteCharAt(curr);
                    stack.pop();
                }else{
                    curr++;
                }
            }
        }

        return br.toString();
    }
}
