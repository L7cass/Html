package Principal;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira o valor principal: R$ ");
		double principal = scanner.nextDouble();

		System.out.print("Insira a taxa de juros (em porcentagem): ");
		double taxaDeJuros = scanner.nextDouble();

		System.out.print("Insira o tempo (em anos): ");
		double tempoEmAnos = scanner.nextDouble();

		double juros = (principal * taxaDeJuros / 100) * tempoEmAnos;

		System.out.println("O valor dos juros simples é de R$ " + juros);

		scanner.close();
	}
}
