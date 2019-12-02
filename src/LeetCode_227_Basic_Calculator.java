import java.util.Stack;

class Solution {
    public static void main(String[] args){
       System.out.println(calculate("3+2*2"));


    }

    private static int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char symbol = '+';
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                num = num * 10 + s.charAt(i) - '0';
            }

            if (i == s.length() - 1 || !Character.isDigit(s.charAt(i))){
                if (s.charAt(i) == ' '){
                    continue;
                }
                if (symbol == '+'){
                    stack.push(num);
                }
                if (symbol == '-'){
                    stack.push(-num);
                }
                if (symbol == '*'){
                    stack.push(stack.pop() * num);
                }
                if (symbol == '/'){
                    stack.push(stack.pop() / num);
                }
                symbol = s.charAt(i);
                num = 0;

            }


        }
        int res = 0;
        for (int i : stack){
            res += i;
        }
        return res;
    }

}
