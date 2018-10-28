package link;

public class LinkStackApp {

    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();

        linkStack.push(20);
        linkStack.push(40);

        linkStack.displayStack();

        linkStack.push(60);
        linkStack.push(80);

        linkStack.displayStack();

        linkStack.pop();
        linkStack.pop();

        linkStack.displayStack();
    }
}
