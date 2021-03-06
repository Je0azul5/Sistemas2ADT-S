
package Sorts;

/**
 * 
 * Bubble Sort
 * <p>
 * In bubble sort (or the sinking sort) we make several bubbling passes through
 * the array. Each pass compares adjacent elements. The elements are swaped in
 * the case the one on the left is greater than the one on the right. At the end
 * of the bubbling pass, we are assured that the largest element is in the
 * right-most position.
 * 
 *
 */
public class BubbleSort {

	/**
	 * bubble largest element in a[0:n-1] to right
	 * 
	 * @param a Comparable[]
	 * @param n int
	 * 
	 */

	/**
	 * sort the array a using the bubble sort method
	 * 
	 * @param a Comparable[]
	 * 
	 */
	public void bubbleSortinverted(Comparable[] a) {
		for (int i = a.length; i > 1; i--)
			bubbleInverted(a, i);
	}

	private void bubbleInverted(Comparable[] a, int n) {

		for (int i = 0; i < n - 1; i++) {

			if (a[i].compareTo(a[i + 1]) < 0) {
				MyMath.swap(a, i, i + 1);

			}

		}
	}

	private static void bubble(Comparable[] a, int n) {

		for (int i = 0; i < n - 1; i++) {

			if (a[i].compareTo(a[i + 1]) > 0) {
				MyMath.swap(a, i, i + 1);
				// z++;
			}
		}
	}

	/**
	 * sort the array a using the bubble sort method
	 * 
	 * @param a Comparable[]
	 * 
	 */
	public static void bubbleSort(Comparable[] a) {
		for (int i = a.length; i > 1; i--)
			bubble(a, i);

	}
}
