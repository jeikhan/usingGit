public class ArraySel {
    private long[] array;
    private int count;

    public ArraySel(int max) {
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

    public void selectionSort() {
        int min, in, out;
        for (out = 0; out < count - 1; out++) {
            min = out;
            for (in = out + 1; in < count; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
