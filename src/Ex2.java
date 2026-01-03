import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			// Variáveis
			int lado, area;
			
			System.out.println("\nSeja bem-vindo!\nExercício 2\n");
			//Entrada de dados
			System.out.println("Informe o tamanho dos lados do quadrado: (cm)");
			System.out.print(">>> ");
			lado = Integer.parseInt(scanner.nextLine());
			
			// Fórmula
			area = lado * lado;
			
			System.out.printf("O tamanho da área do quadrado é igual a %s\n", area);
			
			
			
		}// Fecha o try

	}

}
