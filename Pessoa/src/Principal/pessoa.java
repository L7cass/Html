package Principal;

public class pessoa {

	private String nome;
	private int idade;
	private String sexo;

	public pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Sexo: " + sexo);
	}

	public static void main(String[] args) {

		pessoa pessoa1 = new pessoa("Maria", 32, "Feminino");
		pessoa pessoa2 = new pessoa("João", 22, "Masculino");

		pessoa1.exibirDetalhes();
		System.out.println();
		pessoa2.exibirDetalhes();
	}

}
