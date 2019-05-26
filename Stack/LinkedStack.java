package Stack;

import java.util.EmptyStackException;

import Array_Chain_Stack.ChainNode;

public class LinkedStack implements Stack {

	// data members
	protected ChainNode topNode;
	protected int size = 0;

	public LinkedStack(int initialCapacity) {
	}

	public LinkedStack() {
		this(0);
	}

	public boolean empty() {
		return topNode == null;
	}

	public Object peek() {
		if (empty())
			throw new EmptyStackException();
		return topNode.element;
	}

	public void push(Object theElement) {
		topNode = new ChainNode(theElement, topNode);
		size++;
	}

	public int size() {
		return size;
	}

	public Object pop() {
		if (empty())
			throw new EmptyStackException();
		Object topElement = topNode.element;
		topNode = topNode.next;
		size--;
		return topElement;
	}

	public String toString() {
		StringBuffer s = new StringBuffer("[");

		// put elements into the buffer
		ChainNode currentNode = topNode;

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