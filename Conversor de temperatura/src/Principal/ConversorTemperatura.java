package Principal;

public class ConversorTemperatura {

	public static double celsiusParaFahrenheit(double celsius) {
		double fahrenheit = (celsius * 9 / 5) + 32;
		return fahrenheit;
	}

	public static void main(String[] args) {
		double temperaturaCelsius = 25.0; 

		double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);

		System.out.println(
				temperaturaCelsius + " graus Celsius equivalem a " + temperaturaFahrenheit + " graus Fahrenheit.");
	}

}
