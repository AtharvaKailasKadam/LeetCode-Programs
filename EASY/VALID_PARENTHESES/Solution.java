import java.util.Stack;

class Solution {
    public boolean isValid(String s)
    {
            Stack<Character> stack = new Stack<>();
            for(char ch : s.toCharArray())
            {
                if(ch == '(' || ch == '[' || ch == '{')
                {
                    stack.push(ch);
                }
                else
                {
                    if(stack.isEmpty())
                    {
                        return false;
                    }
                    char top = stack.pop();
                    if((ch == ')' && top != '(') || (ch == '}' && top != '{') ||(ch == ']' && top != '['))
                    {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
    }
        public static void main(String[] args)
        {
            String s = "()";
            String s1 = "(){}[]";
            String s2 = "(]";
            String s3 = "([])";
            String s4 = "([)]";

            Solution sol = new Solution();
            System.out.println(sol.isValid(s));
            System.out.println(sol.isValid(s1));
            System.out.println(sol.isValid(s2));
            System.out.println(sol.isValid(s3));
            System.out.println(sol.isValid(s4));
        }
}