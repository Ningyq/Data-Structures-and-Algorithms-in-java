package link;

public class DoublyLinkedList {
    private LinkDoubly first;
    private LinkDoubly last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dData) {
        LinkDoubly linkDoubly = new LinkDoubly(dData);

        if (isEmpty())
            last = linkDoubly;
        else
            first.previous = linkDoubly;
        linkDoubly.next = first;
        first = linkDoubly;
    }

    public void insertLast(long dData) {
        LinkDoubly linkDoubly = new LinkDoubly(dData);

        if (isEmpty())
            first = linkDoubly;
        else {
            last.next = linkDoubly;
            linkDoubly.previous = last;
        }
        last = linkDoubly;
    }

    public LinkDoubly deleteFirst() {
        LinkDoubly temp = first;

        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public LinkDoubly deleteLast() {
        LinkDoubly temp = last;

        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long dData) {
        LinkDoubly current = first;

        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        LinkDoubly linkDoubly = new LinkDoubly(dData);

        if (current == last) {
            linkDoubly.next = null;
            last = linkDoubly;
        } else {
            linkDoubly.next = current.next;
            current.next.previous = linkDoubly;
        }
        linkDoubly.previous = current;
        current.next = linkDoubly;
        return true;
    }

    public LinkDoubly deleteKey(long key) {
        LinkDoubly current = first;

        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        LinkDoubly current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.print("List (first-->last): ");
        LinkDoubly current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}
