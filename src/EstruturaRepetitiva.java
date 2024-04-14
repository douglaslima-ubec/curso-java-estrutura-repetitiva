import java.util.Scanner;
import java.lang.Math;

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
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

	public static void listarImpares() {
		int X = sc.nextInt();
		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void calcularIntervalo() {
		int N = sc.nextInt();
		int numero;
		int dentro = 0;
		int fora = 0;
		for (int i = 0; i < N; i++) {
			numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
	}

	public static void casosDeTeste() {
		int N = sc.nextInt();
		double[][] casos = new double[N][3];
		double[] mediaPonderada = new double[N];
		for (int i = 0; i < N; i++) {
			casos[i][0] = sc.nextDouble();
			casos[i][1] = sc.nextDouble();
			casos[i][2] = sc.nextDouble();
			mediaPonderada[i] = (casos[i][0] * 2 + casos[i][1] * 3 + casos[i][2] * 5) / 10;
		}
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f%n", mediaPonderada[i]);
		}
	}

	public static void calcularDivisao() {
		int N = sc.nextInt();
		int[][] numeros = new int[N][2];
		double[] divisao = new double[N];
		for (int i = 0; i < N; i++) {
			numeros[i][0] = sc.nextInt();
			numeros[i][1] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (numeros[i][1] == 0) {
				System.out.println("divisao impossivel");
			} else {
				divisao[i] = (double) numeros[i][0] / numeros[i][1];
				System.out.printf("%.1f%n", divisao[i]);
			}
		}
	}

	public static void calcularFatorial() {
		int N = sc.nextInt();
		int fatorial = 1;
		for (int i = 0; i < N; i++) {
			fatorial *= N - i;
		}
		System.out.println(fatorial);
	}

	public static void calcularDivisores() {
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void calcularLinhas() {
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n",i,quadrado,cubo);
		}
	}

}
