package Array_Chain_Stack;

import java.util.EmptyStackException;

public class LinkedStackPos  {

	// data members
	protected ChainNode topNode;
	protected int size = 0;

	// costructor vacio
	public LinkedStackPos(int initialCapacity) {
	}

	public LinkedStackPos() {
		this(0);
	}

	// validacion si la pila es vacia
	public boolean empty() {
		return topNode == null;
	}

	// mira el ultimo objeto agregado
	public Object peek() {
		if (empty())
			throw new EmptyStackException();
		return topNode.element;
	}

	/*
	 * Agrega un objeto al final de la pila
	 *
	 */
	int i=0;
	public void push(Object theElement) {
		topNode = new ChainNode(theElement, topNode);
		System.out.println("push normal: "+i+"   "+ theElement);
		size++;
		i++;
	}

	/*
	 * Remueve el ultimo Objeto de la pila
	 *
	 */
	public Object pop() {
		if (empty())
			throw new EmptyStackException();
		Object topElement = topNode.element;
		topNode = topNode.next;
		size--;
		return topElement;
	}

	/*
	 * Muestra el size
	 */
	public int size() {
		return size;
	}

	/*
	 * + Muestra la pila
	 *
	 */
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

	/*
	 * Agrega un objeto en la posicion index el objeto theElement
	 *
	 */
	public void pushPos(int index, Object theElement) {

		// invalid list position
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("index = " + index + " size = " + size);

		if (index == 0)
			// insert at front
			topNode = new ChainNode(theElement, topNode);
		else { // find predecessor of new element
			ChainNode p = topNode;
			for (int i = 0; i < index - 1; i++) {
				p = p.next;
			// insert after p
			p.next = new ChainNode(theElement, p.next);

			//System.out.println(p.next);
			}
		}
		
		System.out.println("modificado :"+i+" "+theElement);
		size++;

	}
	/*
	 * Verifica si la posicion index es valida
	 *
	 */

	public void checkIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
	}
}