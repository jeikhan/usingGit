public class SelectSortApp {
    public static void main(String[] args) {
        ArraySel aSel = new ArraySel(5);
        aSel.insert(77);
        aSel.insert(99);
        aSel.insert(44);
        aSel.insert(55);
        aSel.insert(22);
        aSel.display();
        aSel.selectionSort();
        aSel.display();
    }
}
