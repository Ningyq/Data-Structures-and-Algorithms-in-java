package link;

public class FirstLastApp {

    public static void main(String[] args) {
        FirstLastList firstLastList = new FirstLastList();

        firstLastList.insertFirst(22);
        firstLastList.insertFirst(44);
        firstLastList.insertFirst(66);

        firstLastList.insertLast(11);
        firstLastList.insertLast(33);
        firstLastList.insertLast(55);

        firstLastList.displayList();

        firstLastList.deleteFirst();
        firstLastList.deleteFirst();

        firstLastList.displayList();
    }
}
