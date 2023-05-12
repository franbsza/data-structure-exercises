package tree;

public class BinaryTree {
    static Node root;

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
        } else {
            insertNode(root,newNode);
        }
    }

    void insertNode(Node node, Node newNode){
        if (newNode.key < node.key){
            if (node.left == null){
                node.left = newNode;
            } else {
                insertNode(node.left, newNode);
            }
        } else {
            if (node.right == null){
                node.right = newNode;
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

        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(5);

        System.out.println("printInorder: ");
        binaryTree.printInorder();
        System.out.println("printPreorder: ");
        binaryTree.printPreorder();
        System.out.println("printPostorder");
        binaryTree.printPostorder();

        binaryTree.printHeight();
    }
}
