package link;

public class LinkStackList {
    private LinkS first;

    public LinkStackList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dData) {
        LinkS newLink = new LinkS(dData);

        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst() {
        LinkS temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList() {
        LinkS current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
