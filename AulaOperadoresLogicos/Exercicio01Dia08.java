package JavaBasico;

import java.util.Scanner;

public class Exercicio01Dia08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario;
		float abono;
		float novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("\nNovo salário: "+ novosalario);
		
		

	}

}
