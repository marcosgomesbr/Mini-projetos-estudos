package MudancaFluxo;

import java.util.Scanner;

public class EMF2 {

	public static void main(String[] args) {
		double n1 = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("---POSITIVO OU NEGATIVO---");
		System.out.println("Escreva um valor: ");
		n1 = l.nextDouble();
		if (n1>0) {
			System.out.println("O valor � positivo");
			
		}
		else if(n1==0) {
			System.out.println("O valor � ??neutro??");
		}
		else {
			System.out.println("O valor � negativo");
		}
		

	}

}
