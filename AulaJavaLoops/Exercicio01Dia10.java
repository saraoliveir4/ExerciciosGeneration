package JavaBasico;

import java.util.Scanner;

public class Exercicio01Dia10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int num1, num2, x;

		System.out.println("Entre com o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("\nEntre com o último número do intervalo: ");
		num2 = leia.nextInt();

		if (num1 > num2) {
			System.out.println("\nIntervalo inválido!");
		} else {
			System.out.println("\nNo intervalo entre " + num1 + " e " + num2 + ":");
			for (x = num1; x <= num2; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println("\n" + x + " é múltiplo de 3 e 5");
				}

			}

		}

	}

}
