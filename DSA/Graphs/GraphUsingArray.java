package Graphs;
public class GraphUsingArray {
    public static void addEdge(int[][] graph, int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int[][] graph = new int[V][V]; // Adjacency matrix

        // Adding edges to the graph
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);

        System.out.println("Graph created with " + V + " vertices.");
        // Print the adjacency matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        // Print the edges in the graph
        System.out.println("Edges in the graph:");
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                if (graph[i][j] == 1) {
                    System.out.println(i + " -- " + j);
                }
            }
        }
        // Print the degree of each vertex
        System.out.println("Degree of each vertex:");
        for (int i = 0; i < V; i++) {
            int degree = 0;
            for (int j = 0; j < V; j++) {
                if (graph[i][j] == 1) {
                    degree++;
                }
            }
            System.out.println("Vertex " + i + ": " + degree);
        }
        // Print the neighbors of each vertex
        System.out.println("Neighbors of each vertex:");
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < V; j++) {
                if (graph[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        // Print the number of edges in the graph
        int edgeCount = 0;
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                if (graph[i][j] == 1) {
                    edgeCount++;
                }
            }
        }
        System.out.println("Number of edges in the graph: " + edgeCount);
    }
}
