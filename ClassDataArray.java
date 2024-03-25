public class ClassDataArray {
    private Person[] a;
    private int elements;

    public ClassDataArray(int max) {
        a = new Person[max];
        elements = 0;
    }

    public Person find(String searchLast) {
        Person result = null;
        int i;
        for (i = 0; i < elements; i++) {
            if (a[i].getLast().equals(searchLast)) {
                result = a[i];
                break;
            }
        }
        return result;
    }

    public void insert(String last, String first, int age) {
        a[elements] = new Person(last, first, age);
        elements++;
    }

    public boolean delete(String searchLast) {
        int i;
        boolean result = false;
        for (i = 0; i < elements; i++) {
            if (a[i].getLast().equals(searchLast)) {
                for (int j = i; j < elements; j++) {
                    a[j] = a[j + 1];
                }
                elements--;
                result = true;
                break;
            }
        }
        return result;
    }
    
    public void displayA() {
        for (int i = 0; i < elements; i++) {
            a[i].displayPerson();
        }
    }
}
