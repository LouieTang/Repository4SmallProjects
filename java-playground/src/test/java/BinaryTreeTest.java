package src.test.java;

import org.junit.Test;

import src.main.java.BinaryTree;
import src.main.java.Node;

public class BinaryTreeTest {
    @Test
    public void balanceTest(){
        BinaryTree btree = new BinaryTree();
        btree.root = new Node(4);
        btree.root.leftNode = new Node(2);
        btree.root.rightNode = new Node(6);
        btree.root.leftNode.leftNode = new Node(1);
        btree.root.leftNode.rightNode = new Node(3);
        btree.root.rightNode.leftNode = new Node(5);
        btree.root.rightNode.rightNode = new Node(7);

    }
}
