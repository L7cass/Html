package Principal;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira o ano: ");
		int ano = scanner.nextInt();

		boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

		if (bissexto) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}

		scanner.close();
	}
}
