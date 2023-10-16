package Principal;

import java.util.Scanner;

public class CalculadoraIMC {

	public static double calcularIMC(double peso, double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("A altura deve ser maior que zero.");
		}

		return peso / (altura * altura);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o seu peso em quilogramas: ");
		double peso = scanner.nextDouble();

		System.out.print("Digite a sua altura em metros: ");
		double altura = scanner.nextDouble();

		double imc = calcularIMC(peso, altura);

		System.out.println("O seu IMC é: " + imc);
	}

}
