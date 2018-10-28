package link;

public class LinkStack {
    private LinkStackList linkStackList;

    public LinkStack() {
        linkStackList = new LinkStackList();
    }

    public void push(long value) {
        linkStackList.insertFirst(value);
    }

    public long pop() {
        return linkStackList.deleteFirst();
    }

    public boolean isEmpty() {
        return (linkStackList.isEmpty());
    }

    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        linkStackList.displayList();
    }
}
