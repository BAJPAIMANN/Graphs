import java.util.*;
public class AdjList {
    int V;
    int E;
    LinkedList<Integer> adj[];
    public AdjList(int nodes){
        this.V=nodes;
        this.E=0;
        this.adj=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adj[i]=new LinkedList<>();
        }
    }

    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb= new StringBuilder();
        System.out.print(V + " vertices "+ E + " Edges " + "\n");
        for(int v=0;v<V;v++){
            sb.append(v + ": ");
            for(int w : adj[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args){

        AdjList g=new AdjList(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);

        System.out.println(g);
    }
}
