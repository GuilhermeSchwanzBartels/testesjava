import java.util.Scanner;

public class while_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a quantidade de patinhos: ");
		int patinho = sc.nextInt();

		while (patinho <= 0) {
			System.out.println("Digite uma quantidade maior que 0: ");
			patinho = sc.nextInt();

		}

		int contagem = patinho - 1;
		int total_patinhos = 0 + patinho;
		while (patinho > 0) {
			System.out.println(patinho + " patinho(s) foram passear\r\n" + "Além das montanhas\r\n" + "Para brincar\r\n"
					+ "A mamãe gritou: Quá, quá, quá, quá Mas só " + contagem + "patinho(s) voltaram \r\n" + "de lá");
			patinho--;
		}

		System.out.println("A mamãe patinha foi procurar\r\n" + "Além das montanhas\r\n" + "Na beira do mar\r\n"
				+ "A mamãe gritou: Quá, quá, quá, quá\r\n" + "E os " + total_patinhos + " patinho(s) voltaram de lá.");

		sc.close();
		;

	}

}
