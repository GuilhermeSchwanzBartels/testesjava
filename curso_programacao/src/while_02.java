import java.util.Scanner;

public class while_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int soma = 0;

		while (X != 0) {
			soma = soma + X;
			X = sc.nextInt();

		}
		System.out.println("A soma de todos os números dígitados é: " + soma);
		sc.close();
	}

}
