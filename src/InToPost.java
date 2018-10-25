public class InToPost {
    private StackChar stackChar;
    private String input;
    private String output = "";

    public InToPost(String input) {
        this.input = input;
        int stackSize = input.length();
        stackChar = new StackChar(stackSize);
    }

    public String doTrans() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stackChar.displayStack("For " + ch + " ");
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    stackChar.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!stackChar.isEmpty()) {
            stackChar.displayStack("While ");
            output = output + stackChar.pop();
        }
        stackChar.displayStack("End  ");
        return output;
    }

    private void gotParen(char ch) {
        while (!stackChar.isEmpty()) {
            char chx = stackChar.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }

    private void gotOper(char opThis, int prec1) {
        while (!stackChar.isEmpty()) {
            char opTop = stackChar.pop();
            if (opTop == '(') {
                stackChar.push(opTop);
                break;
            }
            else {
                int prec2;

                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    stackChar.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        stackChar.push(opThis);
    }
}
