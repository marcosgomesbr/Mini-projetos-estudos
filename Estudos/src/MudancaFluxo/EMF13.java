package MudancaFluxo;

import java.util.Scanner;

public class EMF13 {

	public static void main(String[] args) {
		char c;
		Scanner l = new Scanner(System.in);
		System.out.println("Dia da semana [1-7]:  ");
		c = l.next().toUpperCase().charAt(0);
		switch (c) {
		case '1':
			System.out.println("Domingo");
			break;
		case '2':

			System.out.println("Segunda");
			break;
		case '3':

			System.out.println("Terça");
			break;
		case '4':

			System.out.println("Quarta");
			break;
		case '5':

			System.out.println("Quinta");
			break;
		case '6':

			System.out.println("Sexta");
			break;
		case '7':

			System.out.println("Sábado");
			break;
		case '8':

			System.out.println("Domingo");
			break;
		default: {
			System.out.println("Valor invalido");
		}
		}
	}

}
