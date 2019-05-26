import Stack.*;
/*
 * @author : Jhonatan Sindicue -
 *  @serial: 1000330460
 */
public class Game {
	static Stack x = new ArrayStack();
	static Stack y = new ArrayStack();
	static Stack z = new ArrayStack();

	public static String moving(int a) {

		for (int i = a; i > 0; i--) {
			x.push(i);

		}
		System.out.println("A={" + x.toString() + "} " + "B={" + y.toString() + "} " + "Y={" + z.toString() + "}");

		return " A={" + x.peek() + "}";
	}

	public static String moving(String a, String b) {

		if (a.equals("a") && b.equals("b")) {
			y.push(x.pop());
			System.out.println(" A={" + x.toString() + "} " + "B={" + y.toString() + "} " + "Y={" + z.toString() + "}");

		}

		if (a.equals("a") && b.equals("c")) {

			z.push(x.pop());
			System.out.println(" A={" + x.toString() + "} " + "B={" + y.toString() + "} " + "Y={" + z.toString() + "}");

		}

		if (a.equals("b") && b.equals("a")) {
		//	if ((int) y.peek() < (int) x.peek()) {
				
					x.push(y.pop());
					System.out.println(
							" A={" + x.toString() + "} " + "B={" + y.toString() + "} " + "Y={" + z.toString() + "}");
				}

				if (a.equals("b") && b.equals("c")) {
					if ((int) y.peek() < (int) z.peek()) {

						z.push(y.pop());
						System.out.println(" A={" + x.toString() + "} " + "B={" + y.toString() + "} " + "Y={"
								+ z.toString() + "}");

					}
				}
			
			if (a.equals("c") && b.equals("a")) {
			//	if ((int) z.peek() < (int) x.peek()) {
					x.push(z.pop());
					System.out.println(
							" A={" + x.toString() + "} " + "B={" + y.toString() + "} " + "Y={" + z.toString() + "}");
				//}
			}
			if (a.equals("c") && b.equals("b")) {
		//		if ((int) z.peek() >(int) y.peek()) {
					y.push(z.pop());
					System.out.println(	" A={" + x.toString() + "} " + "B={" + y.toString() + "} " + "Y={" + z.toString() + "}");
			//	}
			}

		
		return "";
	}
}
