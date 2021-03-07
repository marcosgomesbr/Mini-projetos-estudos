import java.util.Scanner;

public class E8 {
	public static void main (String[] args) {
		int salario = 0;
		int ganhoHora = 0;
		int horasTrabalhadas = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("----Calculo Aprox. Salario----");
		System.out.println("Valor por hora: ");
		ganhoHora = l.nextInt();
		System.out.println("Horas trabalhadas: ");
		horasTrabalhadas = l.nextInt();
		salario = ganhoHora*horasTrabalhadas;
		System.out.printf("Salário: %s", salario);
		
		
	}
}
