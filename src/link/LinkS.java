package link;

public class LinkS {
    public long dData;
    public LinkS next;

    public LinkS(long dData) {
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
