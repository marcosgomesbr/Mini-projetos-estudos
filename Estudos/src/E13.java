import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
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
		System.out.printf("Salário BRUTO: %s %n", salario);
		System.out.println("Desconto IMPOSTO DE RENDA: "+(salario-(salario-salario*0.11)));
		System.out.println("Desconto INSS: "+(salario-(salario-salario*0.08)));
		System.out.println("Desconto SINDICATO: "+(salario-(salario-salario*0.05)));
		System.out.println("Salário LIQUIDO: "+(salario-(salario-(salario-salario*0.08)+salario-(salario-salario*0.11)+salario-(salario-salario*0.05))));
		System.out.println("Salario Bruto: "+salario+" - "+(salario-(salario-salario*0.11))+" = "+(salario-(salario-(salario-salario*0.11)))+" (-11% IMPOSTO DE RENDA)"+" | "
		+(salario-(salario-(salario-salario*0.11)))+" - "+(salario-(salario-salario*0.08))+" = "+(salario-(salario-(salario-salario*0.11)+(salario-(salario-salario*0.08))))+" (-08% INSS)"+" | "
				+(salario-(salario-(salario-salario*0.11)+(salario-(salario-salario*0.08))))+" - "+(salario-(salario-salario*0.05))+" = "+(salario-(salario-(salario-salario*0.11)+salario-(salario-salario*0.05)+salario-(salario-salario*0.08)))+"(-05% SINDICATO)"+" | "
					+" Salário LIQUIDO: "+(salario-(salario-(salario-salario*0.11)+salario-(salario-salario*0.05)+salario-(salario-salario*0.08))));
		
		

	}

}
