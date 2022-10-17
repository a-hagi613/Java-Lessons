import java.util.*;

class postFlixToInflix {

    // Complete the function below which converts infix expression to postfix
    // expression Make use of the imported Classes, that might be useful to you.
    // Search for the official documentation to understand the imported class
    // behaviors
    static String infixToPostfix(String exp) {
        System.out.println("User input: " + exp);

        Stack<Character> OpStack = new Stack<Character>();
        Stack<Character> NonOpStack = new Stack<Character>();

        for (int i = 0;
             i < exp.length();
             i++) {
            char c = exp.charAt(i);
            char d = exp.charAt(i);

            if (c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '=' || c == '+' || c == '-' || c == '*' || c == '/' || c == '_') {
                OpStack.push(c);
            }
        }


        for (int i = 0;
             i < exp.length();
             i++) {
            char c = exp.charAt(i);

            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
                OpStack.push(c);
            }
//            else {
//                NonOpStack.push(d);
//            }
        }
//


//
        return "Sorted stack with operators first followed by operands is: " +
                String.valueOf(OpStack);
    }


    public static void main(String[] args) {
        String exp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        exp = sc.nextLine();

        System.out.println(exp);


        // Function call
        System.out.println(infixToPostfix(exp));
    }
}
