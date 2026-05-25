package Graphs;
import java.util.*;
public class BellmanFord {
    // Helper class to represent a weighted edge
    static class Edge {
        int dest, weight;
        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void bellmanFord(List<List<Edge>> adj, int V, int src) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i = 1; i < V; i++) {
            for (int u = 0; u < V; u++) {
                for (Edge edge : adj.get(u)) {
                    int v = edge.dest;
                    int weight = edge.weight;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                    }
                }
            }
        }

        // Check for negative-weight cycles
        for (int u = 0; u < V; u++) {
            for (Edge edge : adj.get(u)) {
                int v = edge.dest;
                int weight = edge.weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }

        // Print all distances
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Adding weighted edges: (u, v, weight)
        adj.get(0).add(new Edge(1, -1));
        adj.get(0).add(new Edge(2, 4));
        adj.get(1).add(new Edge(2, 3));
        adj.get(1).add(new Edge(3, 2));
        adj.get(1).add(new Edge(4, 2));
        adj.get(3).add(new Edge(2, 5));
        adj.get(3).add(new Edge(1, 1));
        adj.get(4).add(new Edge(3, -3));

        bellmanFord(adj, V, 0);
    }
}