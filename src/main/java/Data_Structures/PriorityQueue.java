package Data_Structures;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T> {
    Node<T> top = null;
    int size = 0;

    private class Node<T>{
        T data;
        int index;
        int priority;
        Node<T> succedingNode = null;

        public Node(T data, int priority) {
            this.data = data;
            this.priority = priority;
        }

        public void setSuccedingNode(Node<T> sucedingNode) {
            this.succedingNode = sucedingNode;
        }

        public Node<T> getSuccedingNode() {
            return succedingNode;
        }

        public int getPriority() {return priority;}

        public void setIndex(int index) {this.index = index;}

        @Override
        public String toString() {return data.toString();}
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }

    public Boolean enqueue(T dataToEnqueue, int priority){
        Node<T> newNode = new Node<>(dataToEnqueue, priority);

    }

    public List<Node<T>> getData(){
        Node<T> frontPointer = this.top;
        List<Node<T>> returnList = new ArrayList<>();
        while (!(frontPointer.getSuccedingNode() == null)){
            returnList.add(frontPointer);
            frontPointer = frontPointer.getSuccedingNode();
        }
        return returnList;
    }
}
