package StackAndQueue;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
    }

    public String doReverser() {
        int stackSize = input.length();
        StackChar stack = new StackChar(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        output = "";
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            output = output + ch;
        }
        return output;
    }
}
