package matrizes;

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matriz 3x3 inserida:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Elementos da diagonal principal:");
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][i]);
		}

		System.out.println("Elementos da diagonal secundária:");
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][2 - i]);
		}

		int somaDiagonalPrincipal = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonalPrincipal += matriz[i][i];
		}
		System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

		int somaDiagonalSecundaria = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonalSecundaria += matriz[i][2 - i];
		}
		System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

		scanner.close();
	}

}
