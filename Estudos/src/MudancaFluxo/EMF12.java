package MudancaFluxo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EMF12 {

	public static	 void main(String[] args) {
		double salario = 0 ;
		double valorDesconto = 0;
		double valor = 0;
		double sindicato = 0;
		double impostoRenda = 0;
		double fgts = 0;
		double inss = 0;
		Scanner l = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		System.out.println("----Reajuste salario----");
		System.out.println("Valor do Salario: ");
		salario = l.nextDouble();
		if(salario <= 900) {
			impostoRenda = 0;
			inss = salario-(salario-(salario*0.10));
			fgts = salario-(salario-(salario*0.11));
			sindicato = salario-(salario-(salario*0.03));
			valorDesconto = impostoRenda+sindicato+fgts+inss;
			System.out.println("Salario Bruto:		" + 	salario);
			System.out.println("(-) IR:			Isento");
			System.out.println("(-) INSS (10%): 	"+	inss);
			System.out.println("(-) Sindicato (03%): 	"+	sindicato);
			System.out.println("FGTS (11%): 		"+	fgts);
			System.out.println("Total Desconto: 	"+	valorDesconto);
			System.out.println("Salario Liquido: 	"+	(salario-valorDesconto));
		}
		else if (salario > 900 && salario <= 1500) {
			impostoRenda = salario-(salario-(salario*0.05));
			inss = salario-(salario-(salario*0.10));
			fgts = salario-(salario-(salario*0.11));
			sindicato = salario-(salario-(salario*0.03));
			valorDesconto = impostoRenda+sindicato+fgts+inss;
			System.out.println("Salario Bruto:		" + 	salario);
			System.out.println("(-) IR:			"+	impostoRenda);
			System.out.println("(-) INSS (10%): 	"+	inss);
			System.out.println("(-) Sindicato (03%): 	"+	sindicato);
			System.out.println("FGTS (11%): 		"+	fgts);
			System.out.println("Total Desconto: 	"+	valorDesconto);
			System.out.println("Salario Liquido: 	"+	(salario-valorDesconto));
		}
		else if (salario > 1500 && salario <= 2500) {
			impostoRenda = salario-(salario-(salario*0.10));
			inss = salario-(salario-(salario*0.10));
			fgts = salario-(salario-(salario*0.11));
			sindicato = salario-(salario-(salario*0.03));
			valorDesconto = impostoRenda+sindicato+fgts+inss;
			System.out.println("Salario Bruto:		" + 	salario);
			System.out.println("(-) IR:			"+	impostoRenda);
			System.out.println("(-) INSS (10%): 	"+	inss);
			System.out.println("(-) Sindicato (03%): 	"+	sindicato);
			System.out.println("FGTS (11%): 		"+	fgts);
			System.out.println("Total Desconto: 	"+	valorDesconto);
			System.out.println("Salario Liquido: 	"+	(salario-valorDesconto));
		}
		else if (salario > 2500) {
			impostoRenda = salario-(salario-(salario*0.20));
			inss = salario-(salario-(salario*0.10));
			fgts = salario-(salario-(salario*0.11));
			sindicato = salario-(salario-(salario*0.03));
			valorDesconto = impostoRenda+sindicato+fgts+inss;
			System.out.println("Salario Bruto:		" + 	salario);
			System.out.println("(-) IR:			"+	impostoRenda);
			System.out.println("(-) INSS (10%): 	"+	inss);
			System.out.println("(-) Sindicato (03%): 	"+	sindicato);
			System.out.println("FGTS (11%): 		"+	fgts);
			System.out.println("Total Desconto: 	"+	valorDesconto);
			System.out.println("Salario Liquido: 	"+	(salario-valorDesconto));
		}
	}

}
