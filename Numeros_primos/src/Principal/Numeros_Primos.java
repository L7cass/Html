package Principal;

import java.util.Scanner;

public class Numeros_Primos {

	public static boolean ehPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}

		if (numero <= 3) {
			return true;
		}

		if (numero % 2 == 0 || numero % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= numero; i += 6) {
			if (numero % i == 0 || numero % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para verificar se é primo: ");
		int numero = scanner.nextInt();

		boolean ehPrimo = ehPrimo(numero);

		if (ehPrimo) {
			System.out.println(numero + " é um número primo.");
		} else {
			System.out.println(numero + " não é um número primo.");
		}
	}

}
