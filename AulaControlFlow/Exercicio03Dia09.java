package JavaBasico;

import java.util.Scanner;

public class Exercicio03Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String doador;
		int idade;
		boolean primeira = true;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		doador = leia.nextLine();
		System.out.println("\nDigite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("\nPrimeira doação de sangue? (true/false)");
		primeira = leia.hasNext();
		
		
		if(idade>=18 && idade<=69 && (idade>=60 && idade<=69 && primeira == true)) {
			System.out.println("\n"+doador+" está apto(a) para doar!");
		}else{
			System.out.println("\n"+doador+" não está apto(a) para doar!");
		}

	}

}
