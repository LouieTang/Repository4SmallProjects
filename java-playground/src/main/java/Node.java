package src.main.java;

public class Node {
    public int value;
    public Node leftNode;
    public Node rightNode;

    public Node(int value){
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }
    public Node(int value, Node leftNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = null;
    }
    public Node(int value, Node leftNode, Node rightNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

}
