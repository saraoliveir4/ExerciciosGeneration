package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColecaoExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> listaCores = new ArrayList();
		
		Scanner leia = new Scanner(System.in);
		
		int i;

		for(i=0;i<5;i++) {
			System.out.println("\nDigite uma cor: ");
			String cor = leia.nextLine();
			listaCores.add(cor);
		}
		System.out.println("\nLista de todas as cores: ");
		System.out.println(listaCores);
		Collections.sort(listaCores);
		System.out.println("\nLista das cores ordenadas: ");
		System.out.println(listaCores);
		
	}

}
