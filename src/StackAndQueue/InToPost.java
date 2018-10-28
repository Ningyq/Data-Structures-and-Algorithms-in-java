package StackAndQueue;

public class InToPost {
    private StackChara stackChara;
    private String input;
    private String output = "";

    public InToPost(String input) {
        this.input = input;
        int stackSize = input.length();
        stackChara = new StackChara(stackSize);
    }

    public String doTrans() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stackChara.displayStack("For " + ch + " ");
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
                    stackChara.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!stackChara.isEmpty()) {
            stackChara.displayStack("While ");
            output = output + stackChara.pop();
        }
        stackChara.displayStack("End  ");
        return output;
    }

    private void gotParen(char ch) {
        while (!stackChara.isEmpty()) {
            char chx = stackChara.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }

    private void gotOper(char opThis, int prec1) {
        while (!stackChara.isEmpty()) {
            char opTop = stackChara.pop();
            if (opTop == '(') {
                stackChara.push(opTop);
                break;
            }
            else {
                int prec2;

                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    stackChara.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        stackChara.push(opThis);
    }
}
