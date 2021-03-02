import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		double fare = 0;
		double celsius = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("Celsius ----> Fahrenheit");
		System.out.println("Valor em Celsius: ");
	    celsius = l.nextDouble();
	    fare = (celsius*1.8)+32;
	    
	    System.out.printf("Temperatura em celsius: %.3f",fare);
	    
		

	}

}