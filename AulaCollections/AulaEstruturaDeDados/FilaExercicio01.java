package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaExercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> filaClientes = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int i;
		
		do {
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("\n2 - Listar todos os clientes");
			System.out.println("\n3 - Retirar cliente da fila");
			System.out.println("\n0 - Sair");
			System.out.println("\n\tDigite a opção desejada: ");
			i = leia.nextInt();
			
			switch(i) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				String nome = leia.nextLine();
				filaClientes.add(nome);
				System.out.println("\nO cliente "+nome+" foi adicionado à lista!");
				System.out.println("\nFila: "+filaClientes);
				break;
			case 2:
				leia.nextLine();
				if(filaClientes.isEmpty()){
					System.out.println("\nA fila está vazia!");
				}else
					System.out.println("\nLista de clientes na fila: "+filaClientes);
				break;
			case 3:
				if(filaClientes.isEmpty()){
					System.out.println("\nA fila está vazia!");
				}else {
				filaClientes.remove();
				System.out.println("\nO cliente foi chamado!");
				System.out.println("\nFila: "+filaClientes);
				}
				break;
			case 0:
				System.out.println("\nO programa foi finalizado!");
				break;
			default:
				System.out.println("\nOpção Inválida!");
			}
			
		}while(i != 0);

	}

}
