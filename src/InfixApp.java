import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {
    public static void main(String[] args) throws IOException {
        String input;
        String output;

        while (true) {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;

            InToPost inToPost = new InToPost(input);
            output = inToPost.doTrans();
            System.out.println("Postfix is " + output + '\n');
        }
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        return str;
    }
}
