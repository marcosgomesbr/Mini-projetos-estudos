import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int soma = 0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		System.out.println("SOMA");
		System.out.println("Numero 1: ");
		num1 = leia.nextInt();
		System.out.println("Numero 2: ");
		num2 = leia.nextInt();
		soma = num1 + num2;
		System.out.println(soma);
		
	}
}
