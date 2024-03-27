public class BubbleSortApp {
    public static void main(String[] args) {
        ArrayBub aBub = new ArrayBub(5);
        aBub.insert(77);
        aBub.insert(99);
        aBub.insert(44);
        aBub.insert(55);
        aBub.insert(22);
        aBub.display();
        aBub.bubbleSort();
        aBub.display();
    }
}
