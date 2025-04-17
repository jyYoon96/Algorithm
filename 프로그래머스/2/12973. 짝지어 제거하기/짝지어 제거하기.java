import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<String> stack = new Stack<>();
        String[] str = s.split("");
        
        for (int i = 0; i < str.length; i++) {
            if (stack.empty()) {
                stack.push(str[i]);
            } else {
                if (str[i].equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(str[i]);
                }
            }
        }
                    
        if (stack.empty()) {
            answer = 1;
        } else {
            answer = 0;
        }
                    
                    

        return answer;
    }
}