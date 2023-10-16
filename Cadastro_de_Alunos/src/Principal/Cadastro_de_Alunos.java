package Principal;

import java.util.Arrays;

public class Cadastro_de_Alunos {

	private String nome;
	private int matricula;
	private double[] notas;

	public Cadastro_de_Alunos(String nome, int matricula, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}

	public double calcularMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}

	public boolean estaAprovado(double mediaMinima) {
		return calcularMedia() >= mediaMinima;
	}

	public static void main(String[] args) {

		String nomeAluno = "Jo�o";
		int matriculaAluno = 12345;
		double[] notasAluno = { 7.5, 8.0, 6.5, 9.0 };
		double mediaMinima = 7.0;

		Cadastro_de_Alunos aluno = new Cadastro_de_Alunos(nomeAluno, matriculaAluno, notasAluno);

		double media = aluno.calcularMedia();
		boolean aprovado = aluno.estaAprovado(mediaMinima);

		System.out.println("Nome: " + aluno.nome);
		System.out.println("Matr�cula: " + aluno.matricula);
		System.out.println("Notas: " + Arrays.toString(aluno.notas));
		System.out.println("M�dia: " + media);
		if (aprovado) {
			System.out.println("Situa��o: Aprovado");
		} else {
			System.out.println("Situa��o: Reprovado");
		}
	}

}
