public class AdjMatrix {
    int V;
    int E;
    int adjMatrix[][];
    public AdjMatrix(int nodes){
        this.adjMatrix=new int[nodes][nodes];
        this.V=nodes;
        this.E=0;
    }

    public void addEdge(int u,int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
        E++;

    }
    public void print(int nodes){
        print(adjMatrix,nodes);
    }
    public void print(int adjMatrix[][],int nodes){
        for(int i=0;i<nodes;i++){
            for(int j=0;j<nodes;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjMatrix g=new AdjMatrix(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);

        g.print(4);
    }
}