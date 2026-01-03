import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			// Variáveis
			String name1, name2, message;
			int idade1, idade2, dif;
			
			System.out.println("\nSeja bem-vindo!\nExercício 3\n");
			// Entradade de Dados
			System.out.println("Informe o nome da primeira pessoa: ");
			System.out.print(">>> ");
			name1 = scanner.nextLine();
			
			System.out.println("Informe a idade da primeira pessoa: ");
			System.out.print(">>> ");
			idade1 = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Informe o nome da segunda pessoa: ");
			System.out.print(">>> ");
			name2 = scanner.nextLine();
			
			System.out.println("Informe a idade da segunda pessoa: ");
			System.out.print(">>> ");
			idade2 = Integer.parseInt(scanner.nextLine());
			
				
			// Cálculo para saber quem é mais velho e não retornar negativo
			if (idade1 > idade2) {
				dif = idade1 - idade2;
				message = name1 + " é " + dif + " ano(s) mais velho que " + name2;
			} else if (idade2 > idade1) {
				dif = idade2 - idade1;
				message = name2 + " é " + dif + " ano(s) mais velho que " + name1;
			} else {
				message = "Os dois possuem a mesma idade!";
			}
			
			// Resultado Final
			System.out.println("\nResultado:\n" + message);
			
		} // Fecha o try

	}

}
