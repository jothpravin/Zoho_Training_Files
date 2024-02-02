import java.util.ArrayList;
import java.util.List;

public class GenericcCollection<T extends Number> {
    private List<T> elements;

    public GenericcCollection() {
        elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public T getElement(int index) {
        return elements.get(index);
    }

    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of GenericCollection
        GenericcCollection<Integer> collection = new GenericcCollection<>();

        // Adding elements of different types
        collection.addElement(123);

        // Retrieving and printing elements
        collection.printElements();
    }
}

class CustomObject {
    private String name;

    public CustomObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "name='" + name + '\'' +
                '}';
    }
}

