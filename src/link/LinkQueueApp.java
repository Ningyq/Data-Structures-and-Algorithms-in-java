package link;

public class LinkQueueApp {

    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(20);
        linkQueue.insert(40);

        linkQueue.displayQueue();

        linkQueue.insert(60);
        linkQueue.insert(80);

        linkQueue.displayQueue();

        linkQueue.remove();
        linkQueue.remove();

        linkQueue.displayQueue();
    }
}
