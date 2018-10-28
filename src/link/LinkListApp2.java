package link;

public class LinkListApp2 {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertFirst(22, 2.99);
        linkList.insertFirst(44, 4.99);
        linkList.insertFirst(66, 6.99);
        linkList.insertFirst(88, 8.99);

        linkList.displayList();

        Link findLink = linkList.find(44);

        if (findLink != null)
            System.out.println("Found link with key " + findLink.iData);
        else
            System.out.println("Cant't find link");

        Link deleteLink = linkList.delete(66);

        if (deleteLink != null)
            System.out.println("Deleted link with key " + deleteLink.iData);
        else
            System.out.println("Can't delete link");

        linkList.displayList();
    }
}
