package MudancaFluxo;

import java.util.Scanner;

public class EMF1 {

	public static void main(String[] args) {
		double n1 = 0;
		double n2 = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("---MAIOR NUMERO---");
		System.out.println("Escreva o primeiro numero: ");
		n1 = l.nextDouble();
		System.out.println("Escreva o Segundo numero: ");
		n2 = l.nextDouble();
		if (n1>n2) {
			System.out.println(n1);
		}
		else {
			System.out.println(n2);
		}
		

	}

}
