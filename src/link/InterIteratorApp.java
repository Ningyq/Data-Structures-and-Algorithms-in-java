package link;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIteratorApp {

    public static void main(String[] args) throws IOException {
        LinkListIterator linkListIterator = new LinkListIterator();
        ListIterator listIterator = linkListIterator.getIterator();
        long value;

        listIterator.insertAfter(20);
        listIterator.insertAfter(40);
        listIterator.insertAfter(80);
        listIterator.insertBefore(60);

        while (true) {
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();
            int choice = getChar();
            switch (choice) {
                case 's':
                    if (!linkListIterator.isEmpty())
                        linkListIterator.displayList();
                    else
                        System.out.println("List is empty");
                    break;
                case 'r':
                    listIterator.reset();
                    break;
                case 'n':
                    if (!linkListIterator.isEmpty() && listIterator.atEnd()) {
                        listIterator.nextLink();
                    } else
                        System.out.println("Can't go to next link");
                    break;
                case 'g' :
                    if (!linkListIterator.isEmpty()) {
                        value = listIterator.getCurrent().dData;
                        System.out.println("Returned " + value);
                    } else
                        System.out.println("List is empty");
                    break;
                case 'b':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    listIterator.insertBefore(value);
                    break;
                case 'a':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    listIterator.insertAfter(value);
                    break;
                case 'd':
                    if (!linkListIterator.isEmpty()) {
                        value = listIterator.deleteCurrent();
                        System.out.println("Deleted " + value);
                    } else
                        System.out.println("Can't delete");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        return str;
    }

    private static char getChar() throws IOException {
        String str = getString();
        return str.charAt(0);
    }

    private static int getInt() throws IOException {
        String str = getString();
        return Integer.parseInt(str);
    }
}
