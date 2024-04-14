import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*
		 * A partir do Java versão 19
		 * A classe Locale deve ser instanciada usando os contrutores:
		 * 1. Método de fábrica estático Locale.of(String language, String country, String variant)
		 * 2. Método de fábrica estático Locale.forLanguageTag(String BCP47Tag)
		 * 3. Classe Locale.Builder
		 */
		Locale local = Locale.forLanguageTag("en-US");
		Locale.setDefault(local);
		EstruturaRepetitiva.calcularLinhas();
	}

}