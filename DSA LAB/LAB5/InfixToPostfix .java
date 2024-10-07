import java.util.Stack;

class InfixToPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static boolean isOperator(char x) {
        return (x == '+' || x == '-' || x == '*' || x == '/');
    }

    static String infixToPostfix(String inf_exp) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < inf_exp.length(); i++) {
            char c = inf_exp.charAt(i);

            if (c == ' ')
                continue;

            if (Character.isLetterOrDigit(c)) {
                result += c;
            }

            else if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }

            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String args[]) {
        String infixExp = "A + B * C + D";
        System.out.println("Infix : " + infixExp);
        System.out.println("Postfix : " + infixToPostfix(infixExp));
    }
}