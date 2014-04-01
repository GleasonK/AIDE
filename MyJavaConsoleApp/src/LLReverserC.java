
import java.util.*;
import org.apache.http.impl.client.*;
public class LLReverserC<I> implements LLReverser<I>
{
	//instance variables
	private LinkedList<I> ll;
	private Deque<Integer> dq = new Deque<Integer>();
	
	LLReverserC(){
		this.ll = new LinkedList<I>();
		this.dq = new Deque<I>();
	}
	
	public void push(I info){
		this.ll.push(info);
	}

	public I pop(){
		return this.ll.pop();
	}

	
	public LLReverser reverse(){
		return new LLReverserC<I>();
	}
	
	public static void main(String[] args){
		LLReverser<Integer> llr = new LLReverserC<Integer>();
		llr.push(5);
		llr.push(10);
		llr.push(15);
		llr.push(4);
		llr.toString();
		
	}
}
