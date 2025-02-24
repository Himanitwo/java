package prac2;
import java.util.*;
public class StackDemo {
 public static void main(String[]args) {
	 //create an obj of stack class
	 Stack <Integer> stk= new Stack<>();
	 System.out.println("stack:"+stk);
	 //pushing elements
	 pushelement(stk,10);
	 pushelement(stk,20);
	 pushelement(stk,30);
	 pushelement(stk,40);
	 //popping elements
	 popelement(stk);
	 popelement(stk);
	 //throws an exception if stack is empty
	 try {
		 popelement(stk);
	 }
	 catch(EmptyStackException e){
		 System.out.println("empty stack");
	 }
 }
 
 //performing push operations
 static void pushelement(Stack stk, int x) {
	 //invoking push()method
	 stk.push(new Integer(x));
	 System.out.println("push->"+x);
	 //print modified stack
	 System.out.println("stack:"+stk);
	 
 }
 static void popelement(Stack stk) {
	 //invoking pop()method
	 Integer x =(Integer)stk.pop();
	 System.out.println("pop->"+x);
	 //print modified stack
	 System.out.println("stack:"+stk);
	 
 }
}
