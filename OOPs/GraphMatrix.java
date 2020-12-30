import java.util.*;

public class GraphMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Create thread object
        int numVertices=0;
        int v=0, e=0;
        T1 a = new T1(numVertices);
        T2 b = new T2(v,e);
//Call start method
        a.start();
        b.start();
        T3 c = new T3();
        c.start();
    }
}
class T1 extends Thread{
    int a[][]=new int[3][3];
    private Thread t;
    private boolean adjMatrix[][];
    private int numVertices;
    public T1(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    public void run() {
        T1 g = new T1(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        System.out.print(g.toString());
    }
    public void start(){
        if (t == null) {
            t = new Thread (this);
            t.start ();
        }
    }
}
class T2 extends Thread
{
    private Thread t;
    public static int[][] m2 = new int[4][4];
    int v, e;
    int[][] dir;
    T2(int v, int e) {
        this.v = v;
        this.e = e;
        dir = new int[v][];
        for (int i = 0; i < v; i++)
            dir[i] = new int[v];
    }
    static T2 createGraph(int v, int e)
    {
        T2 G = new T2(v, e);
//direction from 0
        G.dir[0][1] = 1;
        G.dir[0][2] = 1;
        G.dir[0][3] = 1;
//direction from 1
        G.dir[1][0] = 1;
        G.dir[1][3] = 1;
//direction from 2
        G.dir[2][0] = 1;
        G.dir[2][3] = 1;
//direction from 3
        G.dir[3][0] = 1;
        G.dir[3][1] = 1;
        G.dir[3][2] = 1;
        return G;
    }
    static int findDegree(T2 G, int ver)
    {
        int degree = 0;
        for (int i = 0; i < G.v; i++) {
            if (G.dir[ver][i] == 1)
                degree++;
        }
        if(G.dir[ver][ver] == 1) degree++;
        for(int i=0; i<4;i++){
            m2[i][i]=degree;
        }
        return degree;
    }
    public void run()
    {
        int vertices = 4;
        int edges = 5;
        T2 G = createGraph(vertices, edges);
        int ver = 0;
        int degree = findDegree(G, ver);
        System.out.println("Degree is equal to "+ degree);
        for(int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void start(){
        if (t == null) {
            t = new Thread (this);
            t.start ();
        }
    }
}
class T3 extends Thread{
    private Thread t1;
    public T3(){
        System.out.println("");
    }
    public void run(){
        System.out.println();
        System.out.println();
        int m1[][] = {{0,1,1,0},{1,0,1,0},{1,1,0,1},{0,0,1,0}};
        int m2[][] = {{3,0,0,0},{0,3,0,0},{0,0,3,0},{0,0,0,3}};
        int m3[][] = new int[4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(m3[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public void start(){
        if (t1 == null) {
            t1 = new Thread (this);
            t1.start ();
        }
    }
}
