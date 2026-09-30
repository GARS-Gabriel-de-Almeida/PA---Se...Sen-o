import java.util.Scanner;
public class salario {
	Scanner leia = new Scanner(System.in);{

    double salarioMin, salarioPessoa;

    System.out.print("Digite o salário mínimo atual: ");
    salarioMin = leia.nextDouble();

    System.out.print("Digite o seu salário: ");
    salarioPessoa = leia.nextDouble();

    if (salarioPessoa >= salarioMin) {
        System.out.println("Você recebe perante a lei.");
    } else {
        System.out.println("Você não recebe perante a lei.");
    }
    
	}
}
