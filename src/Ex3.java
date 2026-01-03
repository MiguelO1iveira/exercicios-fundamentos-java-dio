import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			// Variáveis
			int base, altura, area;
			
			System.out.println("\nSeja bem-vindo!\nExercício 2\n");
			// Entrada de dados
			System.out.println("Informe o tamanho da base: (cm)");
			System.out.print(">>> ");
			base = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Informe o tamanho da altura: (cm)");
			System.out.print(">>> ");
			altura = Integer.parseInt(scanner.nextLine());
			
			// Fórmula
			area = base * altura;
			
			// Resultado
			System.out.printf("A área é igual a %s", area);
			
		} // Fecha o try

	}

}
