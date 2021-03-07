import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
		int int1 = 0;
		int int2 = 0;
		double real = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("-----INTEIROS E REAIS-----");
		System.out.println("Escreva um numero INTEIRO: ");
		int1 = l.nextInt();
		System.out.println("Escreva novamente um numero INTEIRO: ");
		int2 = l.nextInt();
		System.out.println("Escreva um numero INTEIRO: ");
		real = l.nextDouble();
		System.out.println("O produto do dobro do primeiro com metade do segundo: "+(int1*2*int2/2));
		System.out.println("A soma do triplo do primeiro com o terceiro: "+(int1*3+real));
		System.out.println("O terceiro ao cubo: "+Math.pow(real, 3));
		

	}

}
