package Graphs;
import java.util.*;
public class MST {
    // Helper class for weighted edges
    static class Edge {
        int target, weight;
        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }
    // Node structure for Priority Queue to pick the minimum weight edge
    static class Node implements Comparable<Node> {
        int id, key;
        Node(int id, int key) {
            this.id = id;
            this.key = key;
        }
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.key, other.key);
        }
    }
    public static void primMST(int V, List<List<Edge>> adj) {
        boolean[] inMST = new boolean[V];
        int[] key = new int[V];
        int[] parent = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        key[0] = 0;
        pq.add(new Node(0, 0));
        int totalWeight = 0;
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.id;
            if (inMST[u]) continue;
            inMST[u] = true;
            totalWeight += current.key;
            for (Edge edge : adj.get(u)) {
                if (!inMST[edge.target] && edge.weight < key[edge.target]) {
                    key[edge.target] = edge.weight;
                    parent[edge.target] = u;
                    pq.add(new Node(edge.target, key[edge.target]));
                }
            }
        }
        System.out.println("Minimum Spanning Tree Edges:");
        for (int i = 1; i < V; i++) {
            if (parent[i] != -1) {
                System.out.println(parent[i] + " - " + i + " : " + key[i]);
            }
        }
        System.out.println("Total MST Weight: " + totalWeight);
    }
    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        // Adding undirected weighted edges
        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 3, 6);
        addEdge(adj, 1, 2, 3);
        addEdge(adj, 1, 3, 8);
        addEdge(adj, 1, 4, 5);
        addEdge(adj, 2, 4, 7);
        addEdge(adj, 3, 4, 9);
        primMST(V, adj);
    }
    private static void addEdge(List<List<Edge>> adj, int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w));
    }
}