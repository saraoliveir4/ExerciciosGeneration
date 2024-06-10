package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class PilhaExercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pilhaLivros = new Stack<String>();

		Scanner leia = new Scanner(System.in);

		int i;

		do {
			System.out.println("\n1 - Adicionar um novo livro na pilha");
			System.out.println("\n2 - Listar todos os livros");
			System.out.println("\n3 - Retirar livro da pilha");
			System.out.println("\n0 - Sair");
			System.out.println("\n\tDigite a opção desejada: ");
			i = leia.nextInt();

			switch (i) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				String livro = leia.nextLine();
				pilhaLivros.add(livro);
				System.out.println("\nO livro " + livro + " foi adicionado à pilha!");
				System.out.println("\nFila: " + pilhaLivros);
				break;
			case 2:
				leia.nextLine();
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else
					System.out.println("\nLista de livros na pilha: " + pilhaLivros);
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					pilhaLivros.pop();
					System.out.println("\nUm livro foi retirado da pilha!");
					System.out.println("\nFila: " + pilhaLivros);
				}
				break;
			case 0:
				System.out.println("\nO programa foi finalizado!");
				break;
			default:
				System.out.println("\nOpção Inválida!");
			}

		} while (i != 0);

	}

}
