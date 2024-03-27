public class ArrayIns {
    private long[] array;
    private int count;

    public ArrayIns(int max) {
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

    public void insertionSort() {
        int in, out;
        for (out = 1; out < count; out++) {
            long temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }
}
