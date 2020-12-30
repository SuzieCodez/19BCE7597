import java.util.*;

class generic<E>{
    Stack<E>stack=new Stack<E>();
    public void push(E obj){
        stack.push(obj);
    }
    public E pop(){
    E obj=stack.pop();
    return obj;
    }
}

public class output{
    public static void main(String[] args) {
        generic<Integer> g=new generic<Integer>();
        g.push(36);
        System.out.println(g.pop());
    }
}