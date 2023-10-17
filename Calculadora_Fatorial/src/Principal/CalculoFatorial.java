package Principal;

import java.util.Scanner;

public class CalculoFatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira um n�mero inteiro para calcular o fatorial: ");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("O fatorial n�o est� definido para n�meros negativos.");
		} else {
			long fatorial = calcularFatorial(numero);
			System.out.println("O fatorial de " + numero + " � " + fatorial);
		}

		scanner.close();
	}

	public static long calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			long resultado = 1;
			for (int i = 2; i <= n; i++) {
				resultado *= i;
			}
			return resultado;
		}
	}
}
