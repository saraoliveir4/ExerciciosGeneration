package JavaBasico;

import java.util.Scanner;

public class Exercicio04Dia08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite o terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.println("\nDigite o quarto valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
		
		System.out.println("\nA diferença é: "+diferenca);
		
	}

}
