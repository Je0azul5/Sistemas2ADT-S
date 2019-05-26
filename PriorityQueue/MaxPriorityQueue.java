package PriorityQueue;

public interface MaxPriorityQueue {

	public boolean isEmpty();

	public int size();

	public Comparable getMax();

	public void putMax(Comparable theObject);

	public Comparable removeMax();

	public Comparable removeMin();
	
	public Comparable getMin();

	public void putMin(Comparable theObject);
}