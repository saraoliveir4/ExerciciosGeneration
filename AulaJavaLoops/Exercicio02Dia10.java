package JavaBasico;

import java.util.Scanner;

public class Exercicio02Dia10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int x, num, totalPares = 0, totalImpares = 0;

		for (x = 1; x <= 10; x++) {
			System.out.println("\nEntre com o " + x + "º número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				totalPares++;

			} else {
				totalImpares++;

			}

		}
		System.out.println("\nTotal de números pares: " + totalPares);
		System.out.println("\nTotal de números ímpares: " + totalImpares);
	}

}
