import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {
		double fare = 0;
		double celsius = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("Fahrenheit ---> Celsius");
		System.out.println("Valor em fahrenheit: ");
	    fare = l.nextDouble();
	    celsius = (fare-32)*5/9;
	    System.out.printf("Temperatura em celsius: %.3f",celsius);
	    
		

	}

}
