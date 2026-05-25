package Graphs;
import java.util.*;
public class AllPaths {
    public static void findAllPaths(Graph graph, int start, int end, boolean[] visited, List<Integer> path) {
        visited[start] = true;
        path.add(start);
        if (start == end) {
            System.out.println(path);
        } else {
            for (Integer neighbor : graph.adj[start]) {
                if (!visited[neighbor]) {
                    findAllPaths(graph, neighbor, end, visited, path);
                }
            }
        }
        path.remove(path.size() - 1);
        visited[start] = false;
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);
        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        System.out.println("All paths from vertex 0 to vertex 4:");
        findAllPaths(graph, 0, 4, new boolean[V], new ArrayList<>());
    }
}