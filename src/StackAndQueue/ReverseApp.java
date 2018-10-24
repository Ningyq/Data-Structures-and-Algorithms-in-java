package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {

    public static void main(String[] args) throws Exception {
        String input;
        String output;

        while (true) {
            System.out.print("Enter a String：");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;

            Reverser reverser = new Reverser(input);
            output = reverser.doReverser();
            System.out.println("Reversed = " + output);
        }
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        return str;
    }
}
