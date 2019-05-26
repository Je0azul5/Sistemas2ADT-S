package Tree;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		LinkedBinaryTree z = new LinkedBinaryTree(), a = new LinkedBinaryTree();
		Scanner entrada = new Scanner(System.in);

		// Build dynamic tree
		try {
			z = null;
			z = new LinkedBinaryTree();

			// Root element
			int s = Integer.parseInt(entrada.nextLine());

			z.makeTree(s, a, a);

			while (true) {
				// Search father. End data with a not number.
				s = Integer.parseInt(entrada.nextLine());
				BinaryTreeNode xs = z.Search(s);
				// Found the element?
				if (xs != null) {
					BinaryTreeNode add = new BinaryTreeNode();
					// New element
					s = Integer.parseInt(entrada.nextLine());
					add.element = s;
					add.leftChild = null;
					add.rightChild = null;
					// Rigth(r) or Left(l)
					String pos = entrada.nextLine();
					if (pos.equals("R")) {
						if (xs.rightChild == null) {
							xs.rightChild = add;
						} else {
							xs.rightChild.element = s;
						}
					} else {
						if (pos.equals("L")) {
							if (xs.leftChild == null) {
								xs.leftChild = add;
							} else {
								xs.leftChild.element = s;
							}
						} else {
							System.out.println("Position wrong!!!");
						}
					}
				} else {
					// No matter the new element and its position (the second
					// and third line)
					entrada.nextLine();
					entrada.nextLine();
				}
			}
		} catch (NumberFormatException e) {
			// System.out.println("Exit");
		}
		
		
		System.out.println("Suma del Arbol = " + z.sumaArboladabinaria(z));
		System.out.println("Resta del Arbol = " + z.restaArboladabinaria(z));

		int r = Integer.parseInt(entrada.nextLine());

		for (int i = 0; i < r; i++) {
			// System.out.println("entro");
			int g = Integer.parseInt(entrada.nextLine());
			z.Nodeslevel(z, g);
		}

		entrada.close();
		System.exit(0);
	}

}
