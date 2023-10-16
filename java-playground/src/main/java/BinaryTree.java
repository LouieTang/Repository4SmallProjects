package src.main.java;

public class BinaryTree {
    public Node root;
    public BinaryTree(){
        root = null;
    }



    public static void main(String[] args){
        BinaryTree btree = new BinaryTree();
        btree.root = new Node(4);
        btree.root.leftNode = new Node(2);
        btree.root.rightNode = new Node(6);
        btree.root.leftNode.leftNode = new Node(1);
        btree.root.leftNode.rightNode = new Node(3);
        btree.root.rightNode.leftNode = new Node(5);
        btree.root.rightNode.rightNode = new Node(7);

        System.out.println("In Order: ");
        btree.printNodeInOrder(btree.root);
        System.out.println("Pre Order: ");
        btree.printNodePreOrder(btree.root);
        System.out.println("Post Order: ");
        btree.printNodePostOrder(btree.root);
    }

    private void printNodeInOrder(Node node){
        if (node == null){
            return;
        }
        printNodeInOrder(node.leftNode);
        System.out.println(node.value);
        printNodeInOrder(node.rightNode);
    }

    private void printNodePreOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.value);
        printNodePreOrder(node.leftNode);
        printNodePreOrder(node.rightNode);
    }

    private void printNodePostOrder(Node node){
        if (node == null){
            return;
        }
        printNodePostOrder(node.leftNode);
        printNodePostOrder(node.rightNode);
        System.out.println(node.value);
    }
    
    
}
