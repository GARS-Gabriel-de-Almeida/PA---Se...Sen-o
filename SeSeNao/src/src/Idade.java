import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

 	int anoAtual, anoNascimento, idade;

 	System.out.print("Digite o ano atual: ");
	        anoAtual = leia.nextInt();

	System.out.print("Digite o ano de nascimento: ");
 	anoNascimento = leia.nextInt();

 	idade = anoAtual - anoNascimento;
	System.out.println("Você tem " + idade + " anos.");
	if (idade >= 18) {
		System.out.println("Você é maior de idade.");
 	} else {
 		System.out.println("Você é menor de idade.");
	}
	}
}