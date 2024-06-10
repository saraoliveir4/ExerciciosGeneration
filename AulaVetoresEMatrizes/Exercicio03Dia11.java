package JavaBasico;

import java.util.Scanner;

public class Exercicio03Dia11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[][] numerosMatriz = new int[3][3];
		int linha, coluna, somaPrincipal = 0, somaSecundaria = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nEntre com o valor da linha " + linha + " e coluna " + coluna + ": ");
				numerosMatriz[linha][coluna] = leia.nextInt();
			}
		}
		System.out.println("\nElementos da diagonal principal: ");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					System.out.print(numerosMatriz[linha][coluna] + " ");
				}
			}
		}
		System.out.println("\nElementos da diagonal secundária: ");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha + coluna == 2) {
					System.out.print(numerosMatriz[linha][coluna] + " ");
				}
			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					somaPrincipal += numerosMatriz[linha][coluna];
				}
			}
		}
		System.out.println("\nSoma dos elementos da Diagonal Principal: " + somaPrincipal);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha + coluna == 2) {
					somaSecundaria += numerosMatriz[linha][coluna];
				}
			}
		}
		System.out.println("\nSoma dos elementos da Diagonal Secundária: " + somaSecundaria);
	}
}
