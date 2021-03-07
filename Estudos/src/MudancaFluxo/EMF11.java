package MudancaFluxo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EMF11 {
	public static void main(String[] args) {
		double salario = 0 ;
		double valorAumento = 0;
		double valor = 0;
		Scanner l = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		System.out.println("----Reajuste salario----");
		System.out.println("Valor do Salario: ");
		salario = l.nextDouble();
		if(salario <= 280.00) {
			valorAumento = salario + (salario*0.20);
			valor = valorAumento-salario;
			System.out.println("Salario atual: "+salario);
			System.out.println("Seu salario vai receber um reajuste de 20%!!");
			System.out.println("Valor do Aumento: "+deci.format(valor));
			System.out.println("Novo salario: "+valorAumento);
		}
		else if (salario > 280 && salario <= 700) {
			valorAumento = salario + (salario*0.15);
			valor = valorAumento-salario;
			System.out.println("Salario atual: "+salario);
			System.out.println("Seu salario vai receber um reajuste de 15%!!");
			System.out.println("Valor do Aumento: "+deci.format(valor));
			System.out.println("Novo salario: "+valorAumento);
		}
		else if (salario > 700 && salario <= 1500) {
			valorAumento = salario + (salario*0.10);
			valor = valorAumento-salario;
			System.out.println("Salario atual: "+salario);
			System.out.println("Seu salario vai receber um reajuste de 10%!!");
			System.out.println("Valor do Aumento: "+deci.format(valor));
			System.out.println("Novo salario: "+valorAumento);
		}
		else if (salario > 1500) {
			valorAumento = salario + (salario*0.05);
			valor = valorAumento-salario;
			System.out.println("Salario atual: "+salario);
			System.out.println("Seu salario vai receber um reajuste de 5%!!");
			System.out.println("Valor do Aumento: "+deci.format(valor));
			System.out.println("Novo salario: "+valorAumento);
		}
	}
}
