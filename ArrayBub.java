public class ArrayBub {
    private long[] array;
    private int count;

    public ArrayBub(int max) {
        array = new long[max];
        count = 0;
    }

    public void insert(long value) {
        array[count] = value;
        count++;
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public void bubbleSort() {
        int in, out;
        for (out = count - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
