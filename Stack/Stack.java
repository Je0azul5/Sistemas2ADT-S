package Stack;

/**
 *
 * @author wilson soto
 * 
 */

public interface Stack {
	/**
	 * 
	 * @return
	 */
	public boolean empty();

	/**
	 * 
	 * @return
	 */
	public Object peek();

	/**
	 * 
	 * @param theObject
	 */
	public void push(Object theObject);

	/**
	 * 
	 * @return
	 */
	public Object pop();

	/**
	 * 
	 * @return the stack
	 */
	public String toString();

	/**
	 * @return size
	 */
	public int size();

}
