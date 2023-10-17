package Principal;

import java.util.Scanner;

public class VerificaPalidromos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira uma palavra: ");
		String palavra = scanner.nextLine().toLowerCase().replaceAll(" ", "");

		boolean Palindromo = Palindromo1(palavra);

		if (Palindromo) {
			System.out.println("A palavra é um palíndromo.");
		} else {
			System.out.println("A palavra não é um palíndromo.");
		}

		scanner.close();
	}

	public static boolean Palindromo1(String palavra) {
		int esquerda = 0;
		int direita = palavra.length() - 1;

		while (esquerda < direita) {
			if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}

		return true;
	}
}
