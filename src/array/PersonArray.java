package array;

public class PersonArray {
    private Person[] arr;
    private int nElems;

    public PersonArray(int max) {
        arr = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i].getLastName().equals(searchName))
                break;
        }
        if (i == nElems)
            return null;
        else
            return arr[i];
    }

    public void insert(String lastName, String firstName, int age) {
        arr[nElems] = new Person(lastName, firstName, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int i;
        for (i = 0; i < nElems; i++){
            if (arr[i].getLastName().equals(searchName))
                break;
        }
        if (i == nElems)
            return false;
        else {
            for (int k = i; k < nElems-1; k++)
                arr[k] = arr[k+1];
            nElems--;
            return true;
        }
    }

    public void insertionSort() {
        int in, out;

        for (out = 1; out < nElems; out++) {
            Person temp = arr[out];
            in = out;

            while (in > 0 && arr[in-1].getLastName().compareTo(temp.getLastName()) > 0) {
                arr[in] = arr[in-1];
                --in;
            }
            arr[in] = temp;
        }
    }

    public void displayArray() {
        for (int i = 0; i < nElems; i++) {
            arr[i].displayPerson();
        }
    }
}
