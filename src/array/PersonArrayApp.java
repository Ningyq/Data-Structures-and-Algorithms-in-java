package array;

public class PersonArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        PersonArray arr;
        arr = new PersonArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucida", 18);

        System.out.println("Before sorting: ");
        arr.displayArray();

        arr.insertionSort();

        System.out.println("After sorting: ");
        arr.displayArray();

        String searchKey = "Stimson";
        Person found;

        found = arr.find(searchKey);
        if (found  != null) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Crewell");

        arr.displayArray();
    }
}
