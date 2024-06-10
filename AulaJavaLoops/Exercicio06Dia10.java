package JavaBasico;

import java.util.Scanner;

public class Exercicio06Dia10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int num, soma = 0, quant = 0;
		float media;

		do {
			System.out.println("\nDigite um número inteiro: ");
			num = leia.nextInt();
			if (num == 0) {
				System.out.println("\nVocê digitou zero. Vamos finalizar o programa!");
			} else {
				if (num % 3 == 0) {
					soma += num;
					quant++;
				}
			}

		} while (num != 0);

		if (quant == 0) {
			System.out.println("\nNão foi possível achar a média.");
		} else {
			media = soma / quant;
			System.out.printf("\nA média dos números múltiplos de 3 é: %.2f", media);
		}

	}

}
