import java.util.*;
import java.util.Scanner;

class graph{
    static Scanner in=new Scanner(System.in);
    static int vertex;
    static int matrix[][];

    public static void main(String[] args) {
        System.out.println("Enter no.of vertex");
        vertex=in.nextInt();
        matrix=new int[vertex][vertex];
        addEdge(0,1);
        addEdge(0,4);
        addEdge(1,2);
        addEdge(1,3);
        addEdge(1,4);
        addEdge(2,3);
        addEdge(3,4);

        readAdj T1=new readAdj(matrix,vertex);
        degMat T2=new degMat(matrix,vertex);
        //NewThread T3=new NewThread();
        T1.start();
        T2.start();
        //T3.start();
    }
    public static void addEdge(int s, int d){
        //front edge
        matrix[s][d]=1;
        //back edge
        matrix[d][s]=1;
    }
}

class readAdj extends Thread{
    static int matrix[][],vertex;
    readAdj(int matrix[][],int vertex){
        this.matrix=matrix;
        this.vertex=vertex;
    }

    public void run(){
        print();
    }

    public static void print(){
        System.out.println("Graph:");
        for(int i=0; i<vertex;i++){
            for(int j=0;j<vertex;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
}

class degMat extends Thread{
    static int matrix[][],vertex;
    degMat(int matrix[][],int vertex){
            this.matrix=matrix;
            this.vertex=vertex;
    }

    public void run(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e )
        {
            System.out.println("T2 interrupted!!!");
        }
        print();
    }

    public static void print(){
        for(int i=0;i<vertex;i++){
            for (int j=0;j<vertex;j++){
                if(matrix[i][j]==1){
                    System.out.println("Vertex "+i+" is connected to "+j);
                }
            }
            System.out.println();
        }
    }
}

/*
class lapMat extends Thread{
    NewThread(){
        public void run(){
            try {
                Thread.sleep(30000);
            }catch (InterruptedException e )
            {
                System.out.println("T2 interrupted!!!");
            }

    }
}*/
