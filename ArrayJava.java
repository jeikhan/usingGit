/**
 * description
 *
 * @author Evgeniy Kapaev
 * @since 19/03/2024
 */
public class ArrayJava {
    private final long[] arr;
    
    public ArrayJava() {
        arr = new long[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
    }
    
    public void searchIndexNumber(int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                System.out.println("Searched index of number " + number + " is " + i);
                break;
            }
            if (i == arr.length - 1) {
                System.out.println("number not found");
                break;
            }
        }
    }

    public void deleteItem(int index) {
        System.out.println("Array before deleting");
        for (long l : arr) {
            System.out.print(l + " ");
        }
        System.out.println(" ");
        System.out.println("Array after deleting");
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == index) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public void showSize() {
        System.out.println(arr.length);
    }

    public static void main(String[] args) {
        ArrayJava arrayJava = new ArrayJava();
        arrayJava.showSize();
        arrayJava.searchIndexNumber(11);
        arrayJava.deleteItem(5);
    }
}
