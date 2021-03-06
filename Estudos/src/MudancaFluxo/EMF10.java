package MudancaFluxo;

import java.util.Scanner;

public class EMF10 {

	public static void main(String[] args) {
		char c;
		Scanner l = new Scanner(System.in);
		System.out.println("Qual seu Periodo: [M]-MAtutino, [V]Vespertino, [N]-Noturno?");
		c = l.next().toUpperCase().charAt(0);
		switch (c) {
		case 'M':
			System.out.println("Bom dia!!");
			break;
		case 'V':

			System.out.println("Boa Tarde!!");
			break;
		case 'N':

			System.out.println("Boa Tarde!!");
			break;
		default: {
			System.out.println("Valor invalido");
		}
		}

	}

}
