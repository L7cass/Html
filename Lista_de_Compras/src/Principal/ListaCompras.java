package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompras {

	private List<ItemCompra> itens = new ArrayList<>();

	public void adicionarItem(String nome, double preco) {
		ItemCompra item = new ItemCompra(nome, preco);
		itens.add(item);
		System.out.println(nome + " adicionado à lista de compras.");
	}

	public void removerItem(int indice) {
		if (indice >= 0 && indice < itens.size()) {
			ItemCompra itemRemovido = itens.remove(indice);
			System.out.println(itemRemovido.getNome() + " removido da lista de compras.");
		} else {
			System.out.println("Índice inválido. O item não foi removido.");
		}
	}

	public void listarItens() {
		System.out.println("Lista de Compras:");
		for (int i = 0; i < itens.size(); i++) {
			ItemCompra item = itens.get(i);
			System.out.println((i + 1) + ". " + item.getNome() + " - Preço: R$" + item.getPreco());
		}
	}

	public double calcularCustoTotal() {
		double custoTotal = 0;
		for (ItemCompra item : itens) {
			custoTotal += item.getPreco();
		}
		return custoTotal;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListaCompras lista = new ListaCompras();

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Adicionar item à lista de compras");
			System.out.println("2. Remover item da lista de compras");
			System.out.println("3. Listar itens da lista de compras");
			System.out.println("4. Calcular custo total da lista de compras");
			System.out.println("5. Sair");
			int escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.print("Nome do item: ");
				String nome = scanner.next();
				System.out.print("Preço do item: R$");
				double preco = scanner.nextDouble();
				lista.adicionarItem(nome, preco);
				break;
			case 2:
				System.out.print("Índice do item a ser removido: ");
				int indice = scanner.nextInt();
				lista.removerItem(indice - 1);
				break;
			case 3:
				lista.listarItens();
				break;
			case 4:
				double custoTotal = lista.calcularCustoTotal();
				System.out.println("Custo total da lista de compras: R$" + custoTotal);
				break;
			case 5:
				System.out.println("Saindo do programa.");
				System.exit(0);
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}

class ItemCompra {
	private String nome;
	private double preco;

	public ItemCompra(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

}

