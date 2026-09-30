import java.util.Scanner;
public class SalarioIRPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double salario, irpf;
		
		System.out.println("Insira o Seu salário: ");
		salario = leia.nextDouble();
		
		if (salario >= 3582) {
			irpf = salario * 27.5 / 100 - 662.94;
		}
		else if (salario >= 2866.71) {
			irpf = salario * 22.5 / 100 - 483.84;
		}
		else if (salario >= 2150.01) {
			irpf = salario * 15.0 / 100 - 268.84;
		}
		else if (salario >= 1434.60) {
			irpf = salario * 7.5 / 100 - 107.59;
		}
		else {
			irpf = 0;
		}
		System.out.println("IPRF: " + irpf + " ficando: " + (salario - irpf));
	}

}
