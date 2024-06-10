package EstruturaDeDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSetExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		Set<Integer> listaNumeros = new HashSet<Integer>();

		int i;

		for (i = 0; i < 10; i++) {
			System.out.println("\nDigite um número de 1 a 10 sem repetir: ");
			int numero = leia.nextInt();
			listaNumeros.add(numero);
		}

		System.out.println();

		Iterator<Integer> iListaNumeros = listaNumeros.iterator();

		System.out.println("\nLista de números: ");
		while (iListaNumeros.hasNext()) {
			System.out.println(iListaNumeros.next());

		}
	}
}