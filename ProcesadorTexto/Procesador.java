package ProcesadorTexto;

import Array_Chain_Stack.*;

public class Procesador {

	private LinearList x = new ArrayLinearList();
	private int p = 0;
	private int palabras = 0;

	public LinearList entrada(String a) {
		String[] g = a.split(" ");
		String q = "";

		if (a.charAt(0) == ' ') {
			System.err.println("No deje espacios al inicio ");
			
			System.out.println();
			
			x.add(p, q);
			p++;
			
		} else {
			String j = "";
			char h = mayusAuto(g);

			if (!Character.isUpperCase(g[0].charAt(0))) {
				j = g[0].replace(g[0].charAt(0), h);

				g[0] = j;
			}

			for (int i = 0; i < g.length; i++) {
				try {
					int y = g[i].indexOf('.');

				} catch (Exception e) {
					// TODO: handle exception
				}

			}

			for (int i = 0; i < g.length; i++) {
				q += g[i] + " ";
				palabras++;
			}

		}

		x.add(p, q);
		p++;
		return (LinearList) x;
	}

	public Character mayusAuto(String l[]) {
		// Arreglo
		return Character.toUpperCase(l[0].charAt(0));

	}

	public String justificar() {

		return "";
	}

	public String toString() {
		return x.toString();
	}

	public void agregarParrafos(String a) {

//        try {
//            z = null;
//            z = new LinkedBinaryTree2();
//
//            // Root element
//            int s = Integer.parseInt(entrada.nextLine());
//
//            z.makeTree(s, a, a);
//
//            while (true) {
//                // Search father. End data with a not number.
//                s = Integer.parseInt(entrada.nextLine());
//                BinaryTreeNode xs = z.Search(s);
//                // Found the element?
//                if (xs != null) {
//                    BinaryTreeNode add = new BinaryTreeNode();
//                    // New element
//                    s = Integer.parseInt(entrada.nextLine());
//                    add.element = s;
//                    add.leftChild = null;
//                    add.rightChild = null;
//                    // Rigth(r) or Left(l)
//                    String pos = entrada.nextLine();
//                    if (pos.equals("r")) {
//                        if (xs.rightChild == null) {
//                            xs.rightChild = add;
//                        } else {
//                            xs.rightChild.element = s;
//                        }
//                    } else {
//                        if (pos.equals("l")) {
//                            if (xs.leftChild == null) {
//                                xs.leftChild = add;
//                            } else {
//                                xs.leftChild.element = s;
//                            }
//                        } else {
//                            System.out.println("Position wrong!!!");
//                        }
//                    }
//                } else {
//                    // No matter the new element and its position (the second
//                    // and third line)
//                    entrada.nextLine();
//                    entrada.nextLine();
//                }
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Exit");
//        }

	}

//	public void correctorOrtografico() {
////	pendiente		
//	}

	public void balanceo() {
// pilas
	}

	public void textoRojo() {
		System.err.println("");
	}

	public String controlZ() {
		// pilas
		return "";
	}

	public String buscar() {
		// cola y el parrafo en que esta y ordenamuiento
		return "";
	}

	public int contadorParrafos() {
		// altura del arbol
		return 0;
	}

	public int contadorPalabras() {
		// Array
		return palabras;
	}

	public void mayorParrafo() {
		//

	}

}
