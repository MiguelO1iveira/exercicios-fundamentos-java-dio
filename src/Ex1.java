import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// Variáveis
			int baseYear = OffsetDateTime.now().getYear();
			String name;
			int year, age;
			
			
			System.out.println("\nSeja bem-vindo!\nExercício 1\n");
			
			// Entrada de dados
			System.out.println("Informe o seu nome: ");
			System.out.print(">>> ");
			name = scanner.nextLine();
			
			System.out.println("Informe o seu ano de nascimento: ");
			System.out.print(">>> ");
			year = Integer.parseInt(scanner.nextLine());
			
			// Cálculo
			age = baseYear - year;
			
			// Resultado
			System.out.printf("Olá, %s, você tem %s anos!\n", name, age);
				
			
		} // Fecha o try

	}

}
