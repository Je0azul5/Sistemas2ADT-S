/**
 * 
 */
package PriorityQueue;

import static Sorts.HeapSort.heapSort;

import java.util.Arrays;

/**
 * @author Jhoonatan David Sindicue Alvarado
 * @since 20.11.2018
 * @serial 1000330460
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MaxPriorityQueue x = new MaxHeap();

		x.putMin(27);
		x.putMin(24);
		x.putMin(28);
		x.putMin(26);
		x.putMin(29);
		x.putMin(25);
		x.putMin(222);
		x.putMin(23);
		x.putMin(2);

//		System.out.println(x.toString());

		 System.out.println(x.size());

		Comparable[] a = new Integer[x.size() + 1];
		// System.out.println(a.length);
		int p = 1;
		while (!x.isEmpty()) {
			a[p] = (Integer) x.removeMin();
			p++;
		}

		 System.out.println(Arrays.toString(a));

//		heapSort(a);
//
//		for (int i = 1; i < a.length - 1; i++)
//			System.out.print(a[i + 1] + " ");

//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

	}

}
