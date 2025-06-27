public class App {
        // Binary Search Tree = A tree data structure where each node is greater than it's left child but less than it's right
        //                      Easy to locate anode when they are in this order
        //                      time complexity: bestCase = O(log n), worstCase = O(n)
        //                      space complexity: O(n)
        public static void main(String[] args) throws Exception {
        binarySearchTree tree = new binarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));
        tree.remove(3);
        tree.display();

        System.out.println(tree.search(0));
    }
}
