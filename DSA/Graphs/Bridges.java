package Graphs;
import java.util.*;
public class Bridges {
    private int time = 0;
    public void findBridges(Graph graph) {
        int V = graph.adj.length;
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, disc, low, parent);
            }
        }
    }
    private void dfs(Graph graph, int u, boolean[] visited, int[] disc, int[] low, int[] parent) {
        visited[u] = true;
        disc[u] = low[u] = ++time;
        for (Integer v : graph.adj[u]) {
            if (!visited[v]) {
                parent[v] = u;
                dfs(graph, v, visited, disc, low, parent);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) {
                    System.out.println("Bridge found: " + u + " - " + v);
                }
            } else if (v != parent[u]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}