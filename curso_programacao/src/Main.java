import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

System.out.println("Digite a largura:");
double largura = sc.nextDouble();
System.out.println("Digite o comprimento:");
double comprimento = sc.nextDouble();
System.out.println("Digite o(s) metro(s) quadrado(s):");
double metroquadrado = sc.nextDouble();

double area = largura * comprimento;
double preco = area * metroquadrado;

System.out.printf("AREA = %.2f%n", area);
	System.out.printf("PRECO = %.2f%n", preco);

sc.close();


	}

}
