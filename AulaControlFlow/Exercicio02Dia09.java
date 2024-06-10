package JavaBasico;

import java.util.Scanner;

public class Exercicio02Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		numero = leia.nextInt();
		
		if(numero %2==0 && numero > 0) {
			System.out.println("\nO número "+numero+" é par e positivo!");
		}else if (numero %2 != 0 && numero > 0){
			System.out.println("\nO número "+numero+" é ímpar e positivo!");
		}else if (numero %2 == 0 && numero < 0){
			System.out.println("\nO número "+numero+" é par e negativo!");
		}else if (numero %2 != 0 && numero < 0){
			System.out.println("\nO número "+numero+" é ímpar e negativo!");
		}else {
			System.out.println("\nO número é zero!");
		}

	}

}
