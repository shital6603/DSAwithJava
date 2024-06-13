import java.util.*;

public class Classroom{

    static class Edge
    {
        int src;
        int dest;

        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[])
    {
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,7));
        graph[1].add(new Edge(1,5));

        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,9));
        graph[3].add(new Edge(3,6));
    }
    public static void main(String[] args) { 

        int V=4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        creategraph(graph);

        for (int i = 0; i < graph[3].size(); i++) {
            Edge edge=graph[3].get(i);
            System.out.println(edge.dest+" ");
        }
    }
}










