package Principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		double numero1 = scanner.nextDouble();

		System.out.print("Digite o segundo n�mero: ");
		double numero2 = scanner.nextDouble();

		System.out
				.print("Escolha a opera��o (+ para adi��o, - para subtra��o, * para multiplica��o, / para divis�o): ");
		char operacao = scanner.next().charAt(0);

		double resultado = 0.0;

		switch (operacao) {
		case '+':
			resultado = adicao(numero1, numero2);
			break;
		case '-':
			resultado = subtracao(numero1, numero2);
			break;
		case '*':
			resultado = multiplicacao(numero1, numero2);
			break;
		case '/':
			if (numero2 != 0) {
				resultado = divisao(numero1, numero2);
			} else {
				System.out.println("Erro: Divis�o por zero.");
				return;
			}
			break;
		default:
			System.out.println("Opera��o inv�lida.");
			return;
		}

		System.out.println("Resultado: " + resultado);
	}

	public static double adicao(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtracao(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}

	public static double divisao(double num1, double num2) {
		return num1 / num2;
	}

}
