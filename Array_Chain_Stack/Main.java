package Array_Chain_Stack;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinearList x = new ArrayLinearList();
		LinearList y = new ArrayLinearList();
		LinearList w = new ArrayLinearList();
		LinearList v = new ArrayLinearList();

		int a = in.nextInt();
		// int b = in.nextInt();
		for (int i = 0; i < a; i++)
			x.add(i, in.next());
		System.out.println(x.toString());

		for (int i = 0; i < x.size(); i++) {
			int cont = 0;
			String z = x.get(i) + " esta= ";
			for (int j = 0; j < x.size(); j++)

				if (x.get(j).equals(x.get(i)))
					cont++;

			y.add(i, z + cont);

		}

		for (int i = 0; i < x.size() - 2; i++)
			if (y.get(i).equals(y.get(i + 1)))
				w.add(0, i);
			else if (y.get(i).equals(y.get(i + 2)))
				v.add(0, i);

		for (int i = 0; i < w.size(); i++)
			y.remove((int) w.get((int) i));

		for (int i = 0; i < v.size(); i++)
			y.remove((int) v.get((int) i));

		System.out.println(y.toString());

		in.close();

	}
}
