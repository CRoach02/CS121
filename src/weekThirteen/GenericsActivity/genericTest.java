package weekThirteen.GenericsActivity;

public class genericTest {
    public static void main(String[] args) {
        genericArray generic = new genericArray();
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArray = {"One", "Fish", "Two", "Fish"};

        System.out.print("Integer array: ");
        generic.printArrayList(intArray);
        System.out.print("Double array: ");
        generic.printArrayList(doubleArray);
        System.out.print("Character array: ");
        generic.printArrayList(charArray);
        System.out.print("String array: ");
        generic.printArrayList(stringArray);
    }
}
