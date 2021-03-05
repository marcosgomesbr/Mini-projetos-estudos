package MudancaFluxo;

import java.util.Scanner;

public class EMF5 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
		System.out.println("---MEDIA ALUNO---");
		System.out.println("Nota 1: ");
		nota1 = l.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = l.nextDouble();
		media = nota1 + nota2 / 2;
		if (media >=  7 && media <= 9) {
			System.out.println("ALUNO APROVADO");
		} else if (media >= 10) {
			System.out.println("APROVADO DISTINCAO");
		} else {
			System.out.println("REPROVADO");
		}
	}

}
