package JavaBasico;

import java.util.Scanner;

public class Exercicio05Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int codigo,quant;
		float valortotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tCardápio: ");
		System.out.println("\n1- Cachorro Quente - R$10,00");
		System.out.println("\n2- X-Salada - R$15,00");
		System.out.println("\n3- X-Bacon - R$18,00");
		System.out.println("\n4- Bauru - R$12,00");
		System.out.println("\n5- Refrigerante - R$8,00");
		System.out.println("\n6- Suco de Laranja - R$13,00");
		System.out.println("\nDigite o código do produto: ");
		codigo = leia.nextInt();
		System.out.println("\nDigite a quantidade do produto: ");
		quant = leia.nextInt();
		
		switch(codigo) {
		case 1:
			valortotal = (float) (quant*10.00);
			System.out.printf("\nProduto: Cachorro Quente \nValor Total: R$ %.2f",valortotal);
			break;
		case 2:
			valortotal = (float) (quant*15.00);
			System.out.printf("\nProduto: X-Salada \nValor Total: R$ %.2f",valortotal);
			break;
		case 3:
			valortotal = (float) (quant*18.00);
			System.out.printf("\nProduto: X-Bacon \nValor Total: R$ %.2f",valortotal);
			break;
		case 4:
			valortotal = (float) (quant*12.00);
			System.out.printf("\nProduto: Bauru \nValor Total: R$ %.2f",valortotal);
			break;
		case 5:
			valortotal = (float) (quant*8.00);
			System.out.printf("\nProduto: Refrigerante \nValor Total: R$ %.2f",valortotal);
			break;
		case 6:
			valortotal = (float) (quant*13.00);
			System.out.printf("\nProduto: Suco de Laranja \nValor Total: R$ %.2f",valortotal);
			break;
		}
		
	}

}
