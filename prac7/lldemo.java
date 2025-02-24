package prac7;
 
import java.util.Scanner;
class Node{
	int data;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
public class lldemo {
	static void display(Node head){
		Node p=head;
		while(p!=null) {
			System.out.println("-->"+p.getData());
			p=p.getNext();
			}
		
	}
	static Node deleteposLL(Node head,int pos) {
		Node p=head;
		Node q=p;
		int i= 1;
		pos-=1;
		//if starting is delted
		//move the head pointer ahead and delete
		if(pos==0) {
			head=p.getNext();
			//go ahead
			p=null;
		}
		else {
			//stops 1 node beforenode to be deleted
			while(i!=pos) {
				System.out.println(p.getData());
				p=p.getNext();
				q=p;
				i++;
			}
			p=p.getNext();
			q.setNext(p.getNext());
			p=null;
			
		}
		return head;
	}
	static Node deltepos(Node head,int pos) {
		int i=0;
		Node p=head;
		Node q=head;
		if(pos>i) {
			while(p!=null) {
				//i=i+1;
				p=p.getNext();
				if(i==pos) break;
				q=p;
				//i++;
				
				
			}
			q.setNext(p.getNext());
			p=null;
			
		}

		return head;
		
		/*if(pos==i) {
			
		}*/
		
	}
	static Node createll(int values) {
		Scanner sc=new Scanner(System.in);
		Node head=null;
		Node p=null;
		Node q;
	
	for(int i=0;i<values;i++) {
		System.out.println("enter value: ");
		int tmp_val =sc.nextInt();
		if(head==null) {
			head=new Node(tmp_val);
			p=head;
			
		}
		else if(p!=null) {
			q=new Node(tmp_val);
			p.setNext(q);
			while(p.getNext()!=null) p=p.getNext();			
		}
	}
	return head;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Node LLhead= createll(5);
		display(LLhead);
		
	    

	}

}
