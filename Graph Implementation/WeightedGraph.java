import java.util.*;

//Graph implementatiton using Adjecency list  


public class WeightedGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));

    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        // Printing neighbours of 2
        for (int index = 0; index < graph[2].size(); index++) {
            Edge edge = graph[2].get(index);
            System.out.println(edge.dest + ", "+edge.wt);

        }
    }
}

