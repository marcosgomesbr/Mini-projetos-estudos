package MudancaFluxo;

import java.util.Scanner;

public class EMF4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		char letra;
		System.out.println("--VOGAL OU CONSOANTE--");
		System.out.println("Escreva uma LETRA[A-Z]: ");
		letra = l.next().toUpperCase().charAt(0);
		System.out.println((letra == 'A' || letra =='E'|| letra =='I'|| letra =='O'|| letra =='U')?"VOGAL":"CONSOANTE");
			
		}
	}


