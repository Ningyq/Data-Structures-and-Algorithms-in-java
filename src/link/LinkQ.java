package link;

public class LinkQ {
    public long dData;
    public LinkQ next;

    public LinkQ(long dData) {
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
