class Solution {
    public int evalRPN(String[] tokens) {
         String op = "+-*/";
        Integer finalRes = 0;
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (op.contains(s)) {
                Integer right = stack.pop();
                Integer left = stack.pop();

                switch (s) {
                    case "+":
                        stack.push(left + right);
                        break;
                    case "-":
                        stack.push(left - right);
                        break;
                    case "*":
                        stack.push(left * right);
                        break;
                    case "/":
                        stack.push(left / right);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}
