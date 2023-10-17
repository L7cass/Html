package Principal;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira a quantidade de termos da sequência de Fibonacci a serem exibidos: ");
		int n = scanner.nextInt();

		System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");

		for (int i = 0; i < n; i++) {
			System.out.print(calcularFibonacci(i) + " ");
		}

		scanner.close();
	}

	public static int calcularFibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int termoAnterior = 0;
			int termoAtual = 1;
			int resultado = 0;

			for (int i = 2; i <= n; i++) {
				resultado = termoAnterior + termoAtual;
				termoAnterior = termoAtual;
				termoAtual = resultado;
			}

			return resultado;
		}
	}
}
