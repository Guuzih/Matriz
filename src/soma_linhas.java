import java.util.Scanner;

public class soma_linhas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a quantidade de linhas da matriz?");
		int l = sc.nextInt();

		System.out.println("Qual a quantidade de colunas da matriz?");
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int li = 0; li < mat.length; li++) {

			System.out.println("Digite os elementos da " + (li+1) + "a. linha:");

			for (int co = 0; co < mat[li].length; co++) {
				mat[li][co] = sc.nextInt();
			}
		}

		System.out.println("VETOR GERADO:");
		for (int li = 0; li < mat.length; li++) {
			int soma = 0;
			for (int co = 0; co < mat[li].length; co++) {
				soma += mat[li][co];
				
			}
			System.out.println(soma);
		}

		sc.close();
	}
}
