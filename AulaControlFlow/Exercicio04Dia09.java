package JavaBasico;

import java.util.Scanner;

public class Exercicio04Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra1, palavra2, palavra3;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com a primeira palavra: ");
		palavra1 = leia.nextLine();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = leia.nextLine();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = leia.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnívoro"))
					System.out.println("\nÉ uma águia!");
			} else {
				System.out.println("\nÉ uma pomba!");
			}

		} else {
			if (palavra3.equalsIgnoreCase("ornívoro")) {
				System.out.println("\nÉ um ser humano!");
			} else {
				System.out.println("\nÉ uma vaca!");
			}
		}

	}

}
