package prac3;
class Node{
	int key,data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left =right=null;
	}
	
}


public class BinaryTree {

	Node root;
	BinaryTree()
	{
		root =null;
	}
	void printPostorder(Node node) {
		if(node==null) {
			return;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data+" ");
	}
	void printPreorder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data+" ");
		printPostorder(node.left);
		printPostorder(node.right);
		
	}
	void printinorder(Node node) {
		if(node==null) {
			return;
		}
		printPostorder(node.left);
		System.out.print(node.data+" ");
		printPostorder(node.right);			
	}
	void printinorder(){printinorder(root);};
	void printPostorder() {printPostorder(root);};
	void printPreorder() {printPreorder(root);};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree =new BinaryTree();
		tree.root =new Node(1);
		tree.root =new Node(40);
		tree.root.left=new Node(30);
		tree.root.right=new Node(50);
		tree.root.left.left=new Node(20);
		tree.root.left.right=new Node(35);
		tree.root.left.left.left=new Node(15);
		tree.root.left.left.right=new Node(25);
		System.out.println("inorder: ");
		tree.printinorder();

		System.out.println("postorder: ");
		tree.printPostorder();
		
		System.out.println("preorder: ");
		tree.printPreorder();
		

	}
}
