import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		double media = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("Nota 1: ");
		nota1 = l.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = l.nextDouble();
		System.out.println("Nota 3: ");
		nota3 = l.nextDouble();
		System.out.println("Nota 4: ");
		nota4 = l.nextDouble();
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println(media);
		
		
		
	}
}
