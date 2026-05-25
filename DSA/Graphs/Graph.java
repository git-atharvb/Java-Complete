package Graphs;
import java.util.*;
public class Graph {
    List<Integer>[] adj; // Adjacency list
    @SuppressWarnings("unchecked")
    public Graph(int V) {
        adj = (List<Integer>[]) new List[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // For undirected graph
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        System.out.println("Graph created with " + V + " vertices.");
        // Print the adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer neighbor : graph.adj[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}