package ProcesadorTexto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Procesador x = new Procesador();
		while (true) {
			String d = in.nextLine();
			
			
			
			if (d.equals("0")) {
				break;
			} else {
				x.entrada(d);
			}

		}
		
		System.out.println(x.toString());
		
		
		System.out.println("Cantidad de palabras: "+x.contadorPalabras());
	}
}
