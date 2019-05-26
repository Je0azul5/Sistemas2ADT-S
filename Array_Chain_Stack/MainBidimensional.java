package Array_Chain_Stack;

import java.util.Scanner;

public class MainBidimensional {
	public static void main(String[] args) {

		LinearList v = new ArrayLinearList();
		LinearList h;

		Scanner in = new Scanner(System.in);

		int i = 0;
		String r = "";
		while (!(r = in.nextLine()).equals(".")) {

			String[] s = r.split(" ");
			h = new CircularWithHeader();
			for (int j = 0; j < s.length; j++)
				h.add(j, Integer.parseInt(s[j]));
			// System.out.println(h.toString());

			v.add(i, h);
			// System.out.println(v.toString());
			i++;
		}

		for (int idx = 0; idx < v.size(); idx++) {
			h = (LinearList) v.get(idx);
			System.out.println(h.toString() + " " + idx);

		}

		System.out.println("Diagonal derecha");
		int o = 0;
		for (int idx = 0; idx < v.size(); idx++) {
			h = (LinearList) v.get(idx);
			o += (int) h.get(idx);
			// System.out.println(h.get(idx));
		}
		System.out.println(o);

		System.out.println("Diagonal Invertida");
		int p = 0;
		int j = 0;
		for (int idx = v.size() - 1; idx >= 0; idx--) {

			h = (LinearList) v.get(idx);

			p += (int) h.get(j);
			// System.out.println(j);

			// System.out.println(h.get(j));
			j++;
		}

		System.out.println(p);

		if (p == o)
			System.out.println("Magic Matrix");
		else
			System.out.println("Try Again");

		in.close();
	}

	/*
	 * 
	 * System.out.println("Ceros y unos"); int aux = 0; for (int idx = 0; idx <
	 * v.size(); idx++) {
	 * 
	 * h = (LinearList) v.get(idx); System.out.println(idx+"       "+idx);
	 * 
	 * if (idx == aux) h.set(idx, 2);
	 * 
	 * 
	 * aux++;
	 * 
	 * }
	 * 
	 * for (int idx = 0; idx < v.size(); idx++) { h = (LinearList) v.get(idx);
	 * System.out.println(h.toString() + " " + idx);
	 * 
	 * }
	 * 
	 * // x me ubica en la linea que necesito int x = Integer.parseInt(in.next());
	 * // y la posicion que necesito int y = Integer.parseInt(in.next());
	 * 
	 * h = (LinearList) v.get(x);
	 * 
	 * System.out.println("pos (" + x + "," + y + ") : " + (int) h.get(y));
	 * 
	 * // h.set(y, -1);
	 * 
	 * System.out.println("hola"); for (int idx = 0; idx < v.size(); idx++) { h =
	 * (LinearList) v.get(idx); System.out.println(h.toString()); }
	 * 
	 */
}
