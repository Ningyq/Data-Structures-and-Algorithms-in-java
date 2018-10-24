package StackAndQueue;

public class StackXApp {

    public static void main(String[] args) {
        StackLong stackLong = new StackLong(10);

        stackLong.push(20);
        stackLong.push(40);
        stackLong.push(60);
        stackLong.push(80);

        while (!stackLong.isEmpty()) {
            long value = stackLong.pop();
            System.out.println("value = " + value);
        }

        System.out.println();
    }
}
