package JavaBasico;

import java.util.Scanner;

public class Exercicio06Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario,novosalario;
		
		System.out.println("\tCargos: ");
		System.out.println("\n1- Gerente");
		System.out.println("\n2- Vendedor");
		System.out.println("\n3- Supervisor");
		System.out.println("\n4- Motorista");
		System.out.println("\n5- Estoquista");
		System.out.println("\n6- Técnico de TI");
		System.out.println("\nDigite o nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("\nDigite o código do cargo do colaborador: ");
		codigo = leia.nextInt();
		System.out.println("\nDigite o salário do colaborador: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
		case 1:
			novosalario = (float) (salario *1.1);
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Gerente \nNovo salário: R$ %.2f",novosalario);
			break;
		case 2:
			novosalario = (float) (salario*1.07);
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Vendedor \nNovo salário: R$ %.2f",novosalario);
			break;
		case 3:
			novosalario = (float) (salario*1.09);
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Supervisor \nNovo salário: R$ %.2f",novosalario);
			break;
		case 4:
			novosalario = (float) (salario*1.06);
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Motorista \nNovo salário: R$ %.2f",novosalario);
			break;
		case 5:
			novosalario = (float) (salario*1.05);
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Estoquista \nNovo salário: R$ %.2f",novosalario);
			break;
		case 6:
			novosalario = (float) (salario*1.08);
			System.out.printf("\nNome do colaborador: "+nome+"\nCargo: Técnico de TI \nNovo salário: R$ %.2f",novosalario);
			break;
		}

	}

}
