package array;

public class ArraySort {
    private long[] arr;
    private int nElems;

    public ArraySort(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
    }

    public void  bubbleSort() {
        int out, in;

        for (out = nElems-1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in+1])
                    swap(in, in+1);
            }
        }
    }

     public void  selectSort() {
        int out, in, min;

        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (arr[in] > arr[min])
                    min = in;
            }
            swap(out, min);
        }
    }

    public void insertionSort() {
        int in, out;

        for (out = 1; out < nElems; out++) {
            long temp = arr[out];
            in = out;
            while (in > 0 && arr[in-1] >= temp) {
                arr[in] = arr[in-1];
                --in;
            }
            arr[in] = temp;
        }
    }

    private void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
