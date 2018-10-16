package array;

public class HighArray {
    private long[] arr;
    private int nElems;

    public HighArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == searchKey)
                break;
        }
        if (i == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int i;
        for (i = 0;  i < nElems; i++) {
            if (value == arr[i])
                break;
        }
        if (i == nElems)
            return false;
        else {
            for (int k = i; k < nElems-1; k++) {
                arr[k] = arr[k+1];
            }
            nElems--;
            return true;
        }
    }

    public long getMax() {
        long max = 0L;
        long temp;
        if (nElems != 0) {
            for (int i = 0; i < nElems; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else
            return -1;
    }

    public boolean removeMax() {
        return delete(getMax());
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
    }
}
