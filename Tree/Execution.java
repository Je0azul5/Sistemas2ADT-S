package Tree;

import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {

		LinkedBinaryTree a = new LinkedBinaryTree(), z = new LinkedBinaryTree();;
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
					if (pos.equals("r")) {
						if (xs.rightChild == null) {
							xs.rightChild = add;
						} else {
							xs.rightChild.element = s;
						}
					} else {
						if (pos.equals("l")) {
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
			System.out.println("Exit");
		}

		entrada.close();
//
//		System.out.println("Preorder sequence is ");
//		z.preOrderOutput();
//
//		System.out.println("\nInorder sequence is ");
//		z.inOrderOutput();
//
//		System.out.println("\nPostorder sequence is ");
//		z.postOrderOutput();
//
//		System.out.println("\nLevel order sequence is ");
//		z.levelOrderOutput();
//
//		System.out.println("\nNumber of nodes = " + z.size());
//		System.out.println("Height = " + z.height());

//		System.out.println("suma " + a.sumaArboladabinaria(w));
//		System.out.println("resta " + a.restaArboladabinaria(w));

	}

}
