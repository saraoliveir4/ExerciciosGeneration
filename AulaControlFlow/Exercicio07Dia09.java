package JavaBasico;

import java.util.Scanner;

public class Exercicio07Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,resultado;
		int codigo;
		
		System.out.println("\tCalculadora Simples: ");
		System.out.println("\n1- Soma");
		System.out.println("\n2- Subtração");
		System.out.println("\n3- Multiplicação");
		System.out.println("\n4- Divisão");
		System.out.println("\nDigite o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite o código da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo){
		case 1:
			resultado = n1+n2;
			System.out.println("\n"+n1+" + "+n2+" = "+resultado);
			break;
		case 2:
			resultado = n1-n2;
			System.out.println("\n"+n1+" - "+n2+" = "+resultado);
			break;
		case 3:
			resultado = n1*n2;
			System.out.println("\n"+n1+" * "+n2+" = "+resultado);
			break;
		case 4:
			resultado = n1/n2;
			System.out.println("\n"+n1+" / "+n2+" = "+resultado);
			break;
		default: System.out.printf("\nOperação Inválida!");
		}

	}

}
