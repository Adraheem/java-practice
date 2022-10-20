package snacks.myArrayList;

public class MyArrayList {
    private int counter;
    private final int DEFAULT_LENGTH = 10;
    private int[] elements = new int[DEFAULT_LENGTH];

    public void add(int item) {
        if(counter < elements.length - 1){
            elements[counter++] = item;
        }
    }

    public int size() {
        return counter;
    }

    public void remove(int index) {
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        counter--;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            sb.append(elements[i]);
            if (i != counter - 1) {
                sb.append(", ");
            }
        }

        return "[" + sb.toString() + "]";
    }
}
