package JavaBasico;

import java.util.Scanner;

public class Exercicio01Dia09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o valor de C: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		if(soma>c) {
			System.out.println("\n"+a+"+"+b+"="+soma+">"+c);
			System.out.println("\nA Soma de A + B é maior que C");
		}else if(soma==c) {
			System.out.println("\n"+a+"+"+b+"="+soma+"="+c);
			System.out.println("\nA Soma de A + B é igual a C");
		}else {
			System.out.println("\n"+a+"+"+b+"="+soma+"<"+c);
			System.out.println("\nA Soma de A + B é menor que C");
		}

	}

}
