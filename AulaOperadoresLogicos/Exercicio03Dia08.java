package JavaBasico;

import java.util.Scanner;

public class Exercicio03Dia08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salariobruto,adicionalnoturno,horasextras,descontos,salarioliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		salariobruto = leia.nextFloat();
		System.out.println("\nDigite o adicional noturno: ");
		adicionalnoturno = leia.nextFloat();
		System.out.println("\nDigite a quantidade de horas extras: ");
		horasextras = leia.nextFloat();
		System.out.println("\nDigite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioliquido = (salariobruto+adicionalnoturno+(horasextras*5))-descontos;
		
		System.out.println("\nO valor do salário líquido é: "+salarioliquido);

	}

}
