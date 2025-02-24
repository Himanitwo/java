package prac6;
import java.util.*;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode next;
	
	public TreeNode getNext() {
		return this.next;
	}
	public void setNext(TreeNode next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public TreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}

}

public class tree_demo {
	TreeNode node=null;
	TreeNode root=null;
	TreeNode p=root;
	TreeNode q=root;
	public TreeNode insert(TreeNode root,int data) {
		if(root==null) {
			root =new TreeNode(data);
			return root;
		}
		if(data <= root.getData()) {
			root.setLeft(insert(root.getLeft(),data));
		}
		else if(data>root.getData()) {
			root.setRight(insert(root.getRight(),data));
		}
		return root;
	}
	void inorder(TreeNode node) {
		if(node==null) {
			return;
		}
		
		inorder(node.getLeft());
		System.out.print(node.getData()+" ");
		inorder(node.getRight());
	}
	void postorder(TreeNode node) {
		if(node==null) {
			return;
		}
		postorder(node.getLeft());		
		postorder(node.getRight());
		System.out.print(node.getData()+" ");
	}
	void preorder(TreeNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.getData()+" " );
		preorder(node.getLeft());
		preorder(node.getRight());
	}
	/*TreeNode highest(TreeNode root) {
		TreeNode p=root;
		while?
		return p;
	}
	main(){
	TreeDmoe d=new treedemo();
	treenode t=d.highest(root);
	sop(t.getdata());
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=null;
		tree_demo tree=new tree_demo();
		Scanner dc=new Scanner(System.in);
		System.out.println("enter no of inputs");
		int n=dc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter value");
			int tmp_val=dc.nextInt();
			root=tree.insert(root, tmp_val);
		}
		System.out.println("tree created");
		System.out.println("inorder: ");
		tree.inorder(root);
		System.out.println();
		System.out.println("preorder: ");
		tree.preorder(root);
		System.out.println();
		System.out.println("post order: ");
		tree.postorder(root);

	}

}
