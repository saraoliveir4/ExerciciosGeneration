package JavaBasico;

import java.util.Scanner;

public class Exercicio03Dia10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int idade, maiorQue = 0, menorQue = 0;

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade > -1) {
			if (idade < 21) {
				menorQue++;
			} else if (idade > 50) {
				maiorQue++;
			}
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas com idade menor que 21 anos: "+menorQue);
		System.out.println("\nTotal de pessoas com idade maior que 50 anos: "+maiorQue);

	}

}
