package Principal;

public class Coversor_de_moeda {

	private static final double TAXA_DE_CAMBIO = 0.95; 
	public static double converterDolaresParaEuros(double dolares) {
		return dolares * TAXA_DE_CAMBIO;
	}

	public static void main(String[] args) {
		double quantiaEmDolares = 100.0; 

		double quantiaEmEuros = converterDolaresParaEuros(quantiaEmDolares);

		System.out.println(quantiaEmDolares + " dólares equivalem a " + quantiaEmEuros + " euros.");
	}

}
