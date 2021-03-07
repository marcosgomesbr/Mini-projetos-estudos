import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {
		double tamanhoArquivo = 0;
		double velocidadeInternet = 0;
		double tempoMedio = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("Tamanho Arquivo [Mb]: ");
		tamanhoArquivo = l.nextDouble();
		System.out.println("Velocidade Internet[Mbps]: ");
		velocidadeInternet = l.nextDouble();
		tempoMedio = tamanhoArquivo/velocidadeInternet;
		System.out.printf("O tempo médio para download é aproximadamente: %.2f Min",tempoMedio);

	}

}
