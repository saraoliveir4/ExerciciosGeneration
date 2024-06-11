package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

		Scanner leia = new Scanner(System.in);

		listaNumeros.add(10);
		listaNumeros.add(2);
		listaNumeros.add(4);
		listaNumeros.add(7);
		listaNumeros.add(9);
		listaNumeros.add(5);
		listaNumeros.add(8);
		listaNumeros.add(6);
		listaNumeros.add(3);
		listaNumeros.add(1);

		for (int i = 0; i < listaNumeros.size(); i++) {
			System.out.println("\nDigite o número que deseja encontrar: ");
			int numero = leia.nextInt();

			if (listaNumeros.contains(numero)) {
				System.out.println(
						"\nO número " + numero + " está localizado na posição: " + listaNumeros.indexOf(numero));
			} else
				System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}

}
