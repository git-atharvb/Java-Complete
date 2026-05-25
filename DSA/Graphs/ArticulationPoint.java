package Graphs;
public class ArticulationPoint {
    private int time = 0;
    public void findArticulationPoints(Graph graph) {
        int V = graph.adj.length;
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int[] parent = new int[V];
        boolean[] ap = new boolean[V]; // To store articulation points
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, disc, low, parent, ap);
            }
        }
        System.out.println("Articulation points in the graph:");
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println(i);
            }
        }
    }
    private void dfs(Graph graph, int u, boolean[] visited, int[] disc, int[] low, int[] parent, boolean[] ap) {
        visited[u] = true;
        disc[u] = low[u] = ++time;
        int children = 0;
        for (Integer v : graph.adj[u]) {
            if (!visited[v]) {
                children++;
                parent[v] = u;
                dfs(graph, v, visited, disc, low, parent, ap);
                low[u] = Math.min(low[u], low[v]);
                if (parent[u] == -1 && children > 1) {
                    ap[u] = true;
                }
                if (parent[u] != -1 && low[v] >= disc[u]) {
                    ap[u] = true;
                }
            } else if (v != parent[u]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}