package link;

public class LinkDoubly {
    public long dData;
    public LinkDoubly next;
    public LinkDoubly previous;

    public LinkDoubly(long dData) {
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
