import java.util.Scanner;

public class cada_linha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				System.out.print("Elemento [" + l + "," + c + "]:");
				mat[l][c] = sc.nextInt();
			}
		}

		sc.close();

		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		for (int l = 0; l < mat.length; l++) {
			int maior = 0;
			for (int c = 0; c < mat[l].length; c++) {
				if (maior < mat[l][c]) {
					maior = mat[l][c];
				}

			}
			System.out.println(maior);
		}
	}

}
