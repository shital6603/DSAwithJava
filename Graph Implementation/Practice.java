import java.util.*;

public class Practice {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 5));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.println(curr + " ");

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (vis[edge.dest] == false) {
                dfs(graph, edge.dest, vis);

            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        createGraph(graph);

        dfs(graph, 0, vis);
        
    }
}
