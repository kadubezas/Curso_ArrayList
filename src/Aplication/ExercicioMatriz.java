package Aplication;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();

		int coluna = sc.nextInt();

		int[][] mat = new int[linha][coluna];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int number = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Position " + i + "," + j);

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j + 1 < coluna) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i + 1 < linha) {
						System.out.println("Down: " + mat[i + 1][j]);
					}

				}
			}
		}
		sc.close();
	}

}
