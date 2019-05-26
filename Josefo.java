import java.util.Scanner;
import Queue.*;

public class Josefo {
	public static void main(String[] args) {

		Queue x = new ArrayQueue();
		Queue y = new LinkedQueue();
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		for (int i = 0; i < a; i++)
			x.put(i);

		int c = 1;
		while (x.size() != 0) {
			//System.out.println(c + " " + x.toString());
			x.put(x.remove());
			c++;
			if (c == b) {
				c = 1;
				x.remove();
			}
		//	System.out.println(x.size());
			if (x.size() == 1) {
				y.put(x.getFrontElement());
				break;
			}
		}

		System.out.println(y.toString());
		in.close();
	}
}
