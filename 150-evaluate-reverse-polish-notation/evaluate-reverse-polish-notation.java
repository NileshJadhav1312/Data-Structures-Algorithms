class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") 
                || token.equals("*") || token.equals("/")) {

                int b = stack.pop();  // second operand
                int a = stack.pop();  // first operand

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}

// class Solution {
//     public int evalRPN(String[] tokens) {

//         Stack<Integer> stack = new Stack<>();
//         int i = 0;
//         while (i < tokens.length) {
//             if (tokens[i].equals("+")) {
//                 int num1 = stack.pop();
//                 int num2 = stack.pop();
//                 int ans = (num1 + num2);
//                 stack.push(ans);
//             } else if (tokens[i].equals("-")) {  // if stack is like  5 6 7 
//                 int num1 = stack.pop();       // first element  7
//                 int num2 = stack.pop();    //  then second element  6 
//                 int ans = (num2 - num1);    //operation should be 6-7  
//                 stack.push(ans);
//             } else if (tokens[i].equals("/")) {
//                 int num1 = stack.pop();
//                 int num2 = stack.pop();
//                 int ans = (num2 / num1);
//                 stack.push(ans);
//             } else if (tokens[i].equals("*")) {
//                 int num1 = stack.pop();
//                 int num2 = stack.pop();
//                 int ans = (num1 * num2);
//                 stack.push(ans);
//             }

//             else {
//                 String str = tokens[i];
//                 int strtonum = Integer.parseInt(str);
//                 stack.push(strtonum);
//             }

//             i++;
//         }
//         return stack.peek();
//     }
// }