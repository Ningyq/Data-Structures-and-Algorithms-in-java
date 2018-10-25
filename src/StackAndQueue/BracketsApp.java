package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;

        while (true) {
            System.out.print("Enter string containing delimiter: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;

            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        return str;
    }
}
