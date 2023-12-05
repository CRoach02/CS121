package weekThirteen.GenericsActivity;

public class genericArray {
    public <E> void printArrayList(E[] inputArray){
        for(E element: inputArray){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
