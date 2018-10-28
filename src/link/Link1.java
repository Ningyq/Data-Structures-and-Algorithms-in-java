package link;

public class Link1 {
    public long dData;
    public Link1 next;

    public Link1(long dData) {
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
