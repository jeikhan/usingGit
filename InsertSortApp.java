public class InsertSortApp {
    public static void main(String[] args) {
        ArrayIns aIns = new ArrayIns(5);
        aIns.insert(77);
        aIns.insert(99);
        aIns.insert(44);
        aIns.insert(55);
        aIns.insert(22);
        aIns.display();
        aIns.insertionSort();
        aIns.display();
    }
}
