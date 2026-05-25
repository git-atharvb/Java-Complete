package Graphs;
import java.util.*;
public class BFS {
    static void bfs(Graph graph, int start) {
        int V = graph.V;
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int neighbor : graph.adj[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);
        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        System.out.println("Breadth-First Traversal (BFS) starting from vertex 0:");
        bfs(graph, 0);
    }
}
// Simple Graph implementation used by BFS. Kept package-private so other files in the same package can still use their own Graph if desired.
class Graph {
    int V;
    List<Integer>[] adj;
    @SuppressWarnings("unchecked")
    Graph(int V) {
        this.V = V;
        adj = (List<Integer>[]) new List[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<>();
    }
    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // assuming undirected graph
    }
}