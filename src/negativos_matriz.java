import java.util.Scanner;

public class negativos_matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz?");
		int l = sc.nextInt();

		System.out.print("Qual a quantidade de colunas da matriz?");
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int li = 0; li < mat.length; li++) {

			for (int co = 0; co < mat[li].length; co++) {
				System.out.print("Elemento [" + li + "," + co + "]:");
				mat[li][co] = sc.nextInt();
			}

		}

		sc.close();

		System.out.println("VALORES NEGATIVOS");
		for (int li = 0; li < mat.length; li++) {
			for (int co = 0; co < mat[li].length; co++) {
				if (mat[li][co] < 0) {
					System.out.println(mat[li][co]);
				}

			}

		}

	}

}
