package Principal;

public class Relogio {

	private int hora;
	private int minutos;

	public void definirHora(int hora, int minutos) {
		if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60) {
			this.hora = hora;
			this.minutos = minutos;
		} else {
			System.out.println("Hora ou minutos inválidos.");
		}
	}

	public void exibirHoraAtual() {
		System.out.println("Hora atual: " + String.format("%02d", hora) + ":" + String.format("%02d", minutos));
	}

	public static void main(String[] args) {
		Relogio relogio = new Relogio();

		relogio.definirHora(12, 30);

		relogio.exibirHoraAtual();
	}
}
