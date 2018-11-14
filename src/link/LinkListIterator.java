package link;

public class LinkListIterator {
    private Link1 first;

    public LinkListIterator() {
        first = null;
    }

    public Link1 getFirst() {
        return first;
    }

    public void setFirst(Link1 first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Link1 current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
