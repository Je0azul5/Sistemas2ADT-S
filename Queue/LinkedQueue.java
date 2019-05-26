package Queue;

import Array_Chain_Stack.ChainNode;

/**
 *
 * @author wilson soto
 * @since 14.09.15
 * 
 */

public class LinkedQueue implements Queue {

	// data members
	protected ChainNode front;
	protected ChainNode rear;
	int size = 0;

	public LinkedQueue(int initialCapacity) {
	}

	public LinkedQueue() {
		this(0);
	}

	// methods
	public boolean isEmpty() {
		return front == null;
	}

	public Object getFrontElement() {
		if (isEmpty()) {
			return null;
		} else {
			return front.element;
		}
	}

	public Object getRearElement() {
		if (isEmpty()) {
			return null;
		} else {
			return rear.element;
		}
	}

	public Object remove() {
		if (isEmpty()) {
			return null;
		}
		Object frontElement = front.element;
		front = front.next;
		if (isEmpty()) {
			rear = null; // enable garbage collection
		}
		size--;
		return frontElement;
	}

	public void put(Object theElement) {

		ChainNode p = new ChainNode(theElement, null);

		if (front == null) {
			front = p;
		} else {
			rear.next = p;
		}
		rear = p;
		size++;

	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public String toString() {
		StringBuffer s = new StringBuffer("[");

		// put elements into the buffer
		ChainNode currentNode = front;

		while (currentNode != null) {
			if (currentNode.element == null)
				s.append("null, ");
			else
				s.append(currentNode.element.toString().concat(", "));
			currentNode = currentNode.next;
		}

		// remove last ", "
		if (size > 0)
			s.delete(s.length() - 2, s.length());

		s.append("]");

		// create equivalent String
		return new String(s);

	}
}