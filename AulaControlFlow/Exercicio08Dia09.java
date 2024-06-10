package JavaBasico;

import java.util.Scanner;

public class Exercicio08Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigo;
		float saldo = 1000.00f,valor,novoSaldo;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tConta Bancária Simples: ");
		System.out.println("\n1- Saldo");
		System.out.println("\n2- Saque");
		System.out.println("\n3- Depósito");
		System.out.println("\nDigite o código da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("\nSaldo: R$"+saldo);
			break;
		case 2:
			System.out.println("\nDigite o valor a ser sacado: ");
			valor = leia.nextFloat();
			if(valor>1000) {
				System.out.println("\nSaldo Insuficiente!");
			}else {
			novoSaldo = saldo - valor;
			System.out.println("\nSaldo: R$"+novoSaldo);
			}
			break;
		case 3:
			System.out.println("\nDigite o valor a ser depositado: ");
			valor = leia.nextFloat();
			novoSaldo = saldo + valor;
			System.out.println("\nSaldo: R$"+novoSaldo);
			break;
		default: System.out.println("\nOperação Inválida!");
			}
		
		

	}

}
