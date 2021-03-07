import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		double raio = 0;
		double area = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("-----AREA DO CIRCULO-----");
		System.out.println("Valor raio: ");
		raio = l.nextDouble();
		area = Math.PI*Math.pow(raio, 2);
		System.out.printf("Área do circulo: %.2f", (area));

	}

}
