package Stack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Balanceo z = new Balanceo();
		String x = in.next();
		

		System.out.println(Balanceo.Balanceo(x));

	}

}
