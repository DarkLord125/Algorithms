package Algorithms;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v, int wt){
        this.v= v;
        this.wt = wt;
    }
    public int compareTo(Pair that){
        return this.wt-that.wt;
    }
}

 class PrimsAlgorithm {
     public static void main(String[] args) {
         int v = 5;
         ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>> ();

         for (int i = 0; i < v; i++) {
             adj.add(new ArrayList<ArrayList<Integer>>());
             spanningTree(0, adj);
             spanningTree(0, adj);
             spanningTree(1, adj);
             spanningTree(1, adj);
             spanningTree(1, adj);

         }
     }
    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){

        boolean[] vis = new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();

        q.add(new Pair(0,0));
        int ans = 0;
        while(q.size()!= 0){
            Pair cur = q.remove();

            int u = cur.v;
            if(vis[u]){
                continue;
            }
            ans += cur.wt;
            vis[u] = true;

            ArrayList<ArrayList<Integer>> neighbours = adj.get(u);

            for (ArrayList<Integer> list : neighbours) {
                int vertex = list.get(0);
                int wt = list.get(1);
                if(vis[vertex] == false){
                    q.add(new Pair(vertex,wt));
                }

            }
        }
        return ans;


    }
}

