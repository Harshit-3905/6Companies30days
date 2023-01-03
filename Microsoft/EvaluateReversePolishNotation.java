import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if (t.equals("+")) {
                int b = s.pop();
                int a = s.pop();
                s.push(a + b);
            } else if (t.equals("-")) {
                int b = s.pop();
                int a = s.pop();
                s.push(a - b);
            } else if (t.equals("/")) {
                int b = s.pop();
                int a = s.pop();
                s.push(a / b);
            } else if (t.equals("*")) {
                int b = s.pop();
                int a = s.pop();
                s.push(a * b);
            } else
                s.push(Integer.parseInt(t));
        }
        return s.pop();
    }
}