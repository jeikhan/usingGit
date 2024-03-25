public class ClassDataApp {
    public static void main(String[] args) {
        ClassDataArray arr = new ClassDataArray(100);
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Mike", 34);
        arr.insert("Yee", "Tom", 44);
        arr.insert("Adams", "Henry", 23);
        System.out.println("User list before deleting");
        arr.displayA();
        arr.delete("Evans");
        System.out.println("User list after deleting");
        arr.displayA();
    }
}
