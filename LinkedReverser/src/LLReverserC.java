import java.lang.*;
import java.util.*;
public class LLReverserC<I> implements LLReverser<I>
{
 //instance variables
 private LinkedList<I> ll;
 private Deque<I> dq;
 
 LLReverserC(){
  this.ll = new LinkedList<I>();
  this.dq = new ArrayDeque<I>();
 }
 
 public void push(I info){
  this.ll.push(info);
 }

 public I pop(){
  return this.ll.pop();
 }
 
 public void give(){
	 this.dq.push(this.pop());
 }
 public void get(){
	 this.push(this.dq.pollLast());
 }
 
 public boolean isEmpty(){
	 return this.ll.isEmpty();
 }

 
 public LLReverser<I> reverse(){
     if (!this.isEmpty()) {
		 this.give();
		 return reverse();
	 }
	 while (!this.dq.isEmpty()) this.get();
	 return this;
 }
 
 public String toString(){
	 return this.ll.toString();
 }
 
 public static void main(String[] args){
  LLReverser<Integer> llr = new LLReverserC<Integer>();
  llr.push(5);
  llr.push(10);
  llr.push(15);
  llr.push(4);
  System.out.println("Original" + llr.toString());
  LLReverser<Integer> llr2 = llr.reverse();
  System.out.println("Reversed" + llr2.toString());
  
 }
}
