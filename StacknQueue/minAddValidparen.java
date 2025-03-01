package StacknQueue;

import java.util.Stack;

public class minAddValidparen {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
            
        }
        return stack.size();
        
    }


    public static int minInsertions(String s) {
            Stack<Character> stack=new Stack<>();
            int count=0;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c == '('){
                    stack.push(c);
                }
                else{
                    if(i+1<s.length() && s.charAt(i+1)==')'){
                        i++;
                    }
                    else {
                        count++;
                    }
                    
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                    else{
                        count++;
                    }
                }
            }
            count += 2*stack.size();
            return count;
        }
    
        public static void main(String[] args) {
            System.out.println(minInsertions("(()))"));
    }
}
