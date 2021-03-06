package MudancaFluxo;

import java.util.Scanner;

public class EMF6e7 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int maior = 0;
		int menor = 0;
		Scanner l = new Scanner (System.in);
		System.out.println("---MAIOR E MENOR NUMERO---");
		System.out.println("Primeiro numero: ");
		num1 = l.nextInt();
		System.out.println("Segundo numero: ");
		num2 = l.nextInt();
		System.out.println("Terceiro numero: ");
		num3 = l.nextInt();
		
		if (num1 > num2 && num1 > num3 ) {
			maior = num1;	
		}
		else if (num2 > num1 && num2 > num3 ) {
			maior = num2;
		}
		else if (num3 > num1 && num3 > num2 ) {
			maior = num3;
		}
		if (num1 < num2 && num1 < num3 ) {
			menor = num1;	
		}
		else if (num2 < num1 && num2 < num3 ) {
			menor = num2;
		}
		else if (num3 < num1 && num3 < num2 ) {
			menor = num3;
		}
		System.out.println("Maior Numero: "+maior);
		System.out.println("Menor Numero: "+menor);
		
	}

}
