package StackAndQueue;

public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        StackChar stackChar = new StackChar(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case ']':
                case '(':
                    stackChar.push(ch);
                    break;
                case '}':
                case '[':
                case ')':
                    if  (!stackChar.isEmpty()) {
                        char chx = stackChar.pop();
                        if ((ch == '}' && chx == '{') ||
                            (ch == ']' && chx == '[') ||
                            (ch == ')' && chx == '('))
                            System.out.println("Error: " + ch + " at " + i);
                    }
                    else
                        System.out.println("Error: " + ch + " at " + i);
                    break;
                default:
                    break;
            }
        }
        if (!stackChar.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }
}
