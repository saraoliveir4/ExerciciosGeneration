package JavaBasico;

import java.util.Scanner;

public class Exercicio05Dia10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somaPositivos=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		
		do {
			if(num>0) {
				somaPositivos += num;
			}
			System.out.println("\nDigite um número inteiro: ");
			num = leia.nextInt();
			
		}while(num != 0);
		
		System.out.println("\nA soma dos números positivos é: "+somaPositivos);

	}

}
