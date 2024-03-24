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

    public static void main(String[] args) {
        ArrayJava arrayJava = new ArrayJava();
        arrayJava.searchIndexNumber(11);
    }
}
