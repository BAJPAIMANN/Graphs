import java.util.*;
public class BFS {
    int V;
    int E;
    LinkedList<Integer> adjList[];

    public BFS(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjList=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adjList[i]=new LinkedList<>();
        }
    }

    public void addEdge(int u,int v){
        adjList[u].add(v);
        adjList[v].add(u);
        E++;
    }

    public void bfsGraph(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(q.peek()!=null){
            int u=q.poll();
            System.out.print(u + " ");
            for(int w:adjList[u]){
                if(!visited[w]){
                    visited[w]=true;
                    q.offer(w);
                }
            }
        }
    }
    public static void main(String[] args){

        BFS bfs = new BFS(5);
        bfs.addEdge(0,1);
        bfs.addEdge(1,2);
        bfs.addEdge(2,3);
        bfs.addEdge(3,0);
        bfs.addEdge(2,4);

        bfs.bfsGraph(0);

    }
}
