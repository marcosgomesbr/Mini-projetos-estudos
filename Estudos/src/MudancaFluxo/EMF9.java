package MudancaFluxo;

import java.util.Scanner;

public class EMF9 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("Primeiro numero: ");
		num1 = l.nextInt();
		System.out.println("Segundo numero: ");
		num2 = l.nextInt();
		System.out.println("Terceiro numero: ");
		num3 = l.nextInt();
		if(num1 > num2 && num1> num3) {
			System.out.printf("Ordem descrescente: %s,%s,%s",num3,num2,num1);
		}
		if(num2 > num1 && num2> num3) {
			System.out.printf("Ordem descrescente: %s,%s,%s",num3,num1,num2);
		}
		if(num3 > num2 && num3> num1) {
			System.out.printf("Ordem descrescente: %s,%s,%s",num1,num2,num3);
		}

	}

}
