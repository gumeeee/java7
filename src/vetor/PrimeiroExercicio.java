package vetor;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean encontrado = false;

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número a ser pesquisado:");
		int numeroPesquisado = scanner.nextInt();



		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroPesquisado) {
				System.out.println("O número " + numeroPesquisado + " foi encontrado na posição " + i + " do vetor.");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Não foi encontrado!");
		}

		scanner.close();
	}

}
