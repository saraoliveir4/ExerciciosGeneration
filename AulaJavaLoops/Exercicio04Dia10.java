package JavaBasico;

import java.util.Scanner;

public class Exercicio04Dia10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int idade, identidade, dev, total1 = 0, total2 = 0, total3 = 0, total4 = 0, media, totalIdades = 0,
				numPessoas = 0;
		String opcao = "S";

		while (!opcao.equalsIgnoreCase("n")) {
			System.out.println("Digite a idade do colaborador: ");
			idade = leia.nextInt();
			System.out.println("\n\tIdentidade de Gênero: ");
			System.out.println("\n1- Mulher Cis");
			System.out.println("\n2- Homem Cis");
			System.out.println("\n3- Não Binário");
			System.out.println("\n4- Mulher Trans");
			System.out.println("\n5- Homem Trans");
			System.out.println("\n6- Outros");
			System.out.println("\nDigite o código referente a identidade do colaborador: ");
			identidade = leia.nextInt();
			System.out.println("\n\tPessoa Desenvolvedora: ");
			System.out.println("\n1- Backend");
			System.out.println("\n2- Frontend");
			System.out.println("\n3- Mobile");
			System.out.println("\n4- FullStack");
			dev = leia.nextInt();

			if (dev == 1) {
				total1++;

			} else if ((identidade == 1 || identidade == 4) && dev == 2) {
				total2++;

			} else if ((identidade == 2 || identidade == 5) && dev == 3 && idade > 40) {
				total3++;

			} else if (identidade == 3 && dev == 4 && idade < 30) {
				total4++;

			}
			numPessoas++;

			totalIdades += idade;

			System.out.println("\nDeseja incluir os dados de um novo colaborador? (S/N) ");
			opcao = leia.next();
		}

		media = totalIdades / numPessoas;

		System.out.println("\nO número de pessoas desenvolvedoras Backend é: " + total1);
		System.out.println("\nO número de Mulheres Cis e Trans desenvolvedoras Frontend é: " + total2);
		System.out.println("\nO número de Homens Cis e Trans desenvolvedores Mobile maiores que 40 anos é: " + total3);
		System.out.println("\nO número de Não Binários desenvolvedores FullStack menores que 30 anos é: " + total4);
		System.out.println("\nO número total de pessoas que responderam à pesquisa é: " + numPessoas);
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa é: " + media);

	}

}
