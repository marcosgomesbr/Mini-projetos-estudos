import java.util.Scanner;

public class E7 {
	public static void main(String[] args) {
		double area = 0;
		double base = 0;
		double altura = 0;
		Scanner l = new Scanner (System.in);
		System.out.println("Valor base: ");
		base = l.nextDouble();
		System.out.println("Valor altura: ");
		altura = l.nextDouble();
		area = base*altura;
		System.out.printf("Valor da área: %.2f %n",area);
		System.out.printf("Dobro da área: %.2f %n",area*2);
	}
}
