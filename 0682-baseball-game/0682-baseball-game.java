class Solution {
    Stack<Integer> stack = new Stack<>();

    public int calPoints(String[] operations) {    //reverse polish nloation poostfix to infix
        for (String token : operations) {
            if (token.equals("C") || token.equals("D") || token.equals("+")) {
                switch (token) {
                    case "C":
                        stack.pop();
                        break;
                    case "D":
                        int b = stack.peek();
                        stack.push(2 * b);
                        break;
                    case "+":
                        int a = stack.pop();// first operand
                        int c = stack.peek();// second operand
                        stack.push(a); //push first element

                        stack.push(a + c);
                        break;
                }

            } else {
                stack.push(Integer.parseInt(token));
            }

        }
        int sum = 0; //calculating sum of stack means score
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

}
