import java.util.Scanner;

public class EstruturaRepetitiva {

	private static Scanner sc = new Scanner(System.in);

	public static void enquanto() {
		int soma = 0;
		int numero = sc.nextInt();
		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}
		System.out.println("Total: " + soma);
	}

	public static void verificarSenha() {
		String senhaCorreta = "2002";
		String senha = sc.next();
		while (!senha.equals(senhaCorreta)) {
			System.out.println("Senha Invalida");
			senha = sc.next();
		}
		System.out.println("Acesso Permitido");
	}

	public static void planoCartesiano() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else {
				System.out.println("terceiro");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}

	public static void abastecerCombustivel() {
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int opcao = sc.nextInt();
		while (opcao != 4) {
			switch (opcao) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
			opcao = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
	}

}
