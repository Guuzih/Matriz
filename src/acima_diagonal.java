import java.util.Scanner;

public class acima_diagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				System.out.print("Elemento [" + l + "," + c + "]:");
				mat[l][c] = sc.nextInt();
			}
		}
		int soma = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int c = (i+1); c < mat.length; c++) {
				soma += mat[i][(c)];		
			}

		}
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		sc.close();

	}

}
