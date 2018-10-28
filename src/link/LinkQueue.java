package link;

public class LinkQueue {
    private FirstLastList firstLastList;

    public LinkQueue() {
        firstLastList = new FirstLastList();
    }

    public boolean isEmpty() {
        return firstLastList.isEmpty();
    }

    public void insert(long value) {
        firstLastList.insertLast(value);
    }

    public long remove() {
        return firstLastList.deleteFirst();
    }

    public void displayQueue() {
        System.out.println("Queue (front-->rear): ");
        firstLastList.displayList();
    }
}
