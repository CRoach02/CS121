package weekFifteen.BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        BinarySearchTreeDemo test = new BinarySearchTreeDemo();

        test.addNode('C');
        test.addNode('B');
        test.addNode('E');
        test.addNode('D');
        test.addNode('F');
        test.addNode('G');
        test.addNode('A');

        System.out.print("Preorder: ");
        test.preOrderTraverse(test.getRoot());
        System.out.print("\nInorder: ");
        test.inOrderTraverse(test.getRoot());
        System.out.print("\nPostorder: ");
        test.postOrderTraverse(test.getRoot());

    }
}
