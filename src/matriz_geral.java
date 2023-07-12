import java.util.Scanner;

/*
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
a matriz alterada.
*/

public class matriz_geral {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, indlinha, indcoluna;
		System.out.println("Qual a ordem da matriz?");
		n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				System.out.print("Elemento [" + l + "," + c + "]:");
				mat[l][c] = sc.nextInt();
			}
		}
		int soma = 0;
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] > 0) {
					soma += mat[l][c];
				}
			}
		}

		System.out.printf("\nSOMA DOS POSITIVOS: " + soma);

		System.out.print("\nEscolha uma linha: ");
		indlinha = sc.nextInt();

		System.out.print("\nLINHA ESCOLHIDA: ");
		for (int c = 0; c < mat.length; c++) {
			System.out.print(mat[indlinha][c] + " ");
		}

		System.out.print("\nEscolha uma coluna: ");
		indcoluna = sc.nextInt();

		System.out.print("\nCOLUNA ESCOLHIDA: ");
		for (int l = 0; l < mat.length; l++) {
			System.out.print(mat[l][indcoluna] + " ");
		}
		
		sc.close();
		
		System.out.print("\nDIAGONAL PRINCIPAL: ");
		for (int l = 0; l < mat.length; l++) {
			System.out.print(mat[l][l] + " ");

		}

		System.out.println("\nMATRIZ ALTERADA: ");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] < 0) {
					mat[l][c] *= mat[l][c];
				}
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}

	}

}
