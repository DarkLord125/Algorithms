package Algorithms;

import java.util.ArrayList;

public class SingleSourceShortestPathDP {
    static class Node{
       private int u;
        private int v;
        private int weight;

        Node(int _u,int _v,int _w){
            this.u = _u;
            this.v = _v;
            this.weight = _w;
        }

        Node() {}
        int getV() {return v;}
        int getU() {return u;}
        int getWeight() {return weight;}
    }

    static void bellmanFord(ArrayList<Node> edges, int N, int src){

        int[] dist = new int[N];
            for (int i = 0; i <N; i++) {
                dist[i] = 10000000;
                dist[src] = 0;
            }

        for(int i = 1;i<=N-1;i++) {
            for(Node node : edges) {
                if(dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
                    dist[node.getV()] = dist[node.getU()] + node.getWeight();
                }
            }
        }

        int fl = 0;
        for(Node node: edges) {
            if(dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
                fl = 1;
                System.out.println("Negative Cycle");
                break;
            }
        }

        if(fl == 0) {
            for(int i = 0;i<N;i++) {
                System.out.print(  dist[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        int n = 8;
        ArrayList<Node> adj = new ArrayList<Node>();

        adj.add(new Node(1,2,6));
        adj.add(new Node(1,3,5));
        adj.add(new Node(1,4,5));
        adj.add(new Node(2,5,-1));
        adj.add(new Node(3,5,1));
        adj.add(new Node(3,2,-2));
        adj.add(new Node(4,6,-1));
        adj.add(new Node(5,7,3));
        adj.add(new Node(6,7,3));

        bellmanFord(adj,n,0);

    }
}
