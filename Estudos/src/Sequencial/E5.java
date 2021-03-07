import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		double metro = 0;
		double centimetro = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("METRO EM CENTIMETROS");
		System.out.println("Valor em Metros");
		metro = l.nextDouble();		
		centimetro = metro*100;
		System.out.printf("Valor em centimetros: %.0f", (centimetro));
		
		
	}
}
