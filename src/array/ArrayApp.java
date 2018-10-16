package array;

public class ArrayApp {

    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;
        int i;
        long searchKey;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;

        for (i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        searchKey = 66;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == searchKey)
                break;
        }
        if (i == nElems){
            System.out.printf("Can't find " + searchKey);
        } else {
            System.out.printf("Found " + searchKey + " in " + (i+1));
            System.out.println("");
        }

        searchKey = 77;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == searchKey)
                break;
        }
        for (int k = i; k < nElems - 1; k++) {
            arr[k] = arr[k+1];
        }
        nElems--;

        for (i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
