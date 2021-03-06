package MudancaFluxo;

import java.util.Scanner;

public class EMF8 {

	public static void main(String[] args) {
		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;
		double menor = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("---MENOR VALOR DO PRODUTO---");
		System.out.println("Produto 1: ");
		valor1 = l.nextDouble();
		System.out.println("Produto 2: ");
		valor2 = l.nextDouble();
		System.out.println("Produto 3: ");
		valor3 = l.nextDouble();
		if (valor1 < valor2 && valor1 < valor3 ) {
			menor = valor1;	
		}
		else if (valor2 < valor1 && valor2 < valor3 ) {
			menor = valor2;
		}
		else if (valor3 < valor1 && valor3 < valor2 ) {
			menor = valor3;
		}
		System.out.println("Menor valor: "+menor);
	}

}
