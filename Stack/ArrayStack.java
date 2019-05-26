package Stack;

import java.util.EmptyStackException;

import Utilities.ChangeArrayLength;

public class ArrayStack implements Stack {
	// data members
	int top; // current top of stack
	Object[] stack; // element array
	protected int size;

	// constructors
	public ArrayStack(int initialCapacity) {

		if (initialCapacity < 1)
			throw new IllegalArgumentException("initialCapacity must be >= 1");
		stack = new Object[initialCapacity];
		top = -1;
	}

	public ArrayStack() {
		this(10);
	}

	// methods
	public boolean empty() {
		return top == -1;
	}

	public Object peek() {
		if (empty())
			throw new EmptyStackException();
		return stack[top];
	}

	public void push(Object theElement) {
		// increase array size if necessary
		if (top == stack.length - 1)
			stack = ChangeArrayLength.changeLength1D(stack, 2 * stack.length);

		// put theElement at the top of the stack
		size++;
		stack[++top] = theElement;
	}

	public Object pop() {
		if (empty())
			throw new EmptyStackException();
		Object topElement = stack[top];
		stack[top--] = null; // enable garbage collection
		size--;
		return topElement;
	}

	public String toString() {
		StringBuffer s = new StringBuffer("[ ");
		// put elements into the buffer
		for (int i = 0; i <= top; i++)
			if (stack[i] == null)
				s.append("null, ");
			else
				s.append(stack[i].toString() + ", ");

		if (top > 0)
			s.delete(s.length() -2, s.length());

		s.append(" ]");
		// create equivalent String
		return new String(s);
	}

	/* (non-Javadoc)
	 * @see Stack.Stack#size()
	 */
	@Override
	public int size() {
		return size;
	}
}