
package Queue;

/**
 * 
 * @author wilson soto
 * @since 14.09.15
 * 
 */

public class ArrayQueue implements Queue {

	// data members
	int front; // one counterclockwise from first element
	int rear; // position of rear element of queue
	Object[] queue; // element array
	int size = 0;

	public int size() {
		return size;
	}

	public ArrayQueue(int initialCapacity) {
		if (initialCapacity < 1)
			throw new IllegalArgumentException("initialCapacity must be >= 1");
		queue = new Object[initialCapacity + 1];
		// default front = rear = 0
	}

	public ArrayQueue() { // use default capacity of 10
		this(10);
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public Object getFrontElement() {
		if (isEmpty()) {
			return null;
		} else {
			return queue[(front + 1) % queue.length];
		}
	}

	public Object getRearElement() {
		if (isEmpty()) {
			return null;
		} else {
			return queue[rear];
		}
	}

	public Object remove() {
		if (isEmpty()) 
			return null;
		
		front = (front + 1) % queue.length;
		Object frontElement = queue[front];
		queue[front] = null; // enable garbage collection
		size--;
		return frontElement;
	}
	

	public void put(Object theElement) {
		// increase array length if necessary
		if ((rear + 1) % queue.length == front) {// double array size
			// allocate a new array
			Object[] newQueue = new Object[2 * queue.length];
			// copy elements into new array
			int start = (front + 1) % queue.length;
			if (start < 2) // no wrap around
			{
				System.arraycopy(queue, start, newQueue, 0, queue.length - 1);
			} else { // queue wraps around
				System.arraycopy(queue, start, newQueue, 0, queue.length - start);
				System.arraycopy(queue, 0, newQueue, queue.length - start, rear + 1);
			}
			// switch to newQueue and set front and rear
			front = newQueue.length - 1;
			rear = queue.length - 2;
			queue = newQueue;
		}
		// put theElement at the rear of the queue
		rear = (rear + 1) % queue.length;
		queue[rear] = theElement;
		size++;
	}
	public String toString() {
		StringBuffer s = new StringBuffer("[");
		// put elements into the buffer
		for (int i = 0; i <= rear; i++)
			if (queue[i] == null)
				s.append("");
			else
				s.append(queue[i].toString() + ", ");

		if (rear > 0)
			s.delete(s.length()-2, s.length());

		s.append("]");
		// create equivalent String
		return new String(s);
	}

}
