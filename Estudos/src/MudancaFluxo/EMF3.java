package MudancaFluxo;

import java.util.Scanner;

public class EMF3 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in); 
		char sexo;
		System.out.println("[F] ou [M]: ");
		sexo = l.next().toUpperCase().charAt(0);
		if (sexo == 'M') {
			System.out.println("O sexo é Masculino");
		}
		else  if (sexo == 'F') {
			System.out.println("O sexo é feminino");
		}
		else {
			System.out.println("INVALIDO");
		}

	}

}
