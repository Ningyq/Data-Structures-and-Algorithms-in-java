package link;

public class SortedList {
    private Link1 first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(long key) {
        Link1 newLink = new Link1(key);
        Link1 previous = null;
        Link1 current = first;

        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }

        if (previous == null)
            first = newLink;
        else
            previous.next = newLink;
        newLink.next = current;
    }

    public Link1 remove() {
        Link1 temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link1 current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
