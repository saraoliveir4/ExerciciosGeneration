package JavaBasico;

import java.util.Scanner;

public class Exercicio01Dia11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numVetor = { 1, 5, 10, 6, 8, 4, 7, 9, 2, 3 };
		int num, posicao;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o número que deseja encontrar: ");
		num = leia.nextInt();

		posicao = pesquisarNumero(numVetor, num);

		if (posicao != -1) {
			System.out.println("\nO número " + num + " foi encontrado e está na posição: " + posicao);
		} else {
			System.out.println("\nO número " + num + " não foi encontrado!");
		}
	}

	private static int pesquisarNumero(int[] numVetor, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numVetor.length; i++) {
			if (numVetor[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
