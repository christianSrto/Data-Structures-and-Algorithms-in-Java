public class App {
    // Adjacency Matrix = An array to store 1's/0's to represent edges
    // # of rows = # of unique nodes
    // # of columns = # of unique nodes
    // runtime complexity to check an edge: O(1)
    // space complexity: O(n^2)
    public static void main(String[] args) throws Exception {
        graph graph = new graph(5);

        graph.addNode(new node('A'));
        graph.addNode(new node('B'));
        graph.addNode(new node('C'));
        graph.addNode(new node('D'));
        graph.addNode(new node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(0, 1));
    }
}
