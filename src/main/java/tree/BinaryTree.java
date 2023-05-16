package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static Node root;
    int size;

    public BinaryTree(){
        this.root = null;
    }

    public class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    void insert(int key){
        Node newNode = new Node(key);

        if (root == null){
            root = newNode;
            size++;
        } else {
            insertNode(root,newNode);
        }
    }

    void insertNode(Node node, Node newNode){
        if (newNode.key < node.key){
            if (node.left == null){
                node.left = newNode;
                size++;
            } else {
                insertNode(node.left, newNode);
            }
        } else {
            if (node.right == null){
                node.right = newNode;
                size++;
            } else {
                insertNode(node.right, newNode);
            }
        }
    }

    void traverseInOrder(Node node){
        if (node == null)
            return;
        traverseInOrder(node.left);
        System.out.println(node.key + " ");
        traverseInOrder(node.right);
    }

    void printInorder() {
        traverseInOrder(this.root);
    }

    void traversePreorder(Node node)
    {
        if (node == null)
            return;
        System.out.println(node.key + " ");
        traversePreorder(node.left);
        traversePreorder(node.right);
    }


    void printPreorder() {
        traversePreorder(root);
    }

    void traversePostorder(Node node)
    {
        if (node == null)
            return;
        traversePostorder(node.left);
        traversePostorder(node.right);
        System.out.println(node.key + " ");
    }

    void leverlOrder(Node node){
        if(node == this.root){
            node = this.root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
           node = queue.remove();
           System.out.printf(node.key + " ");
           if(node.left != null){
               queue.add(node.left);
           }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    void printPostorder() {
        traversePostorder(root);
    }

     static int getHeight(Node node)
    {
        if(node == null){
            return 0;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if(right > left){
            return right + 1;
        }
        return left + 1;
    }

    static void printHeight(){
        System.out.printf(String.valueOf(getHeight(root)));
    }


    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(61);
        binaryTree.insert(89);
        binaryTree.insert(66);
        binaryTree.insert(43);
        binaryTree.insert(51);
        binaryTree.insert(16);
        binaryTree.insert(55);
        binaryTree.insert(11);
        binaryTree.insert(79);
        binaryTree.insert(77);
        binaryTree.insert(82);
        binaryTree.insert(32);

        binaryTree.printInorder();
        binaryTree.printPreorder();
        binaryTree.printPostorder();
        binaryTree.leverlOrder(root);
    }
}
