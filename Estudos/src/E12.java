import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		double altura = 0;
		System.out.println("---Peso Ideal---");
		System.out.println("Forne�a sua altura : ");
		altura = l.nextDouble();
		System.out.printf("Seu peso ideal �: %.2f",72.2*altura-58);
	}

}
