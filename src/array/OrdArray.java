package array;

public class OrdArray {
    private long[] arr;
    private int nElems;

    public OrdArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound)/2;
            if (arr[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (arr[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i] > value)
                break;
        }
        for (int k = nElems; k > i; k--) {
            arr[k] = arr[k-1];
        }
        arr[i] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int i = find(value);
        if (i == nElems)
            return false;
        else {
            for (int k = i; k < nElems; k++) {
                arr[k] = arr[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
