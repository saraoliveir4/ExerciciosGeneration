package JavaBasico;

import java.util.Scanner;

public class Exercicio01Dia11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numVetor = { 1, 5, 10, 6, 8, 4, 7, 9, 2, 3 };

		Scanner leia = new Scanner(System.in);

		System.out.print("\nDigite um número para pesquisar: ");
		int numero = leia.nextInt();

		int i = 0;
		boolean encontrado = false;

		while (i < numVetor.length && !encontrado) {
			if (numVetor[i] == numero) {
				encontrado = true;
			} else {
				i++;
			}
		}

		if (encontrado) {
			System.out.println("\nO número " + numero + " está na posição " + i + " do vetor.");
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}
}