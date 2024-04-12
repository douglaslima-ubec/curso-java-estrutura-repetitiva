import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale local = new Locale("en", "US");
		Locale.setDefault(local);
		EstruturaRepetitiva.abastecerCombustivel();
	}

}
