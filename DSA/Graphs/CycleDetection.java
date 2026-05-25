package Graphs;
public class CycleDetection {
    public static boolean hasCycle(Graph graph, int vertex, boolean[] visited, int parent) {
        visited[vertex] = true;
        for (Integer neighbor : graph.adj[vertex]) {
            if (!visited[neighbor]) {
                if (hasCycle(graph, neighbor, visited, vertex)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true; // A cycle is detected
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);
        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0); // This edge creates a cycle
        graph.addEdge(3, 4);
        boolean[] visited = new boolean[V];
        boolean hasCycle = false;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (hasCycle(graph, i, visited, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        if (hasCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}