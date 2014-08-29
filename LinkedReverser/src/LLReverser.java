public interface LLReverser<I>
{
	public LLReverser<I> reverse();
	public void give();
	public void get();
	public void push(I info);
	public I pop();
	public String toString();
	public boolean isEmpty();
}
