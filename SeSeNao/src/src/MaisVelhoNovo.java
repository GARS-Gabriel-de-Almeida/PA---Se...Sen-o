import java.util.Scanner;
public class MaisVelhoNovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String  nomeA, nomeB;
		int idadeA, idadeB;
		
		System.out.println("Insira o nome da primeira pessoa: ");
		nomeA = leia.nextLine();
		
		System.out.println("Insira o nome da segunda pessoa: ");
		nomeB = leia.nextLine();

		System.out.println("Insira a idade da primeira pessoa: ");
		idadeA = leia.nextInt();
	
		System.out.println("Insira a idade da segunda pessoa: ");
		idadeB = leia.nextInt();
		
		if (idadeA > idadeB) {
			System.out.println(nomeA + " possui " + idadeA + " anos. Logo, é mais velho do que " + nomeB + " que possui " + idadeB + " anos.");
		}
		else if (idadeA < idadeB) {
			System.out.println(nomeB + " possui " + idadeB + " anos. Logo, é mais velho do que " + nomeA + " que possui " + idadeA + " anos.");
		}
		else {
			System.out.println("Ambos possuem a mesma idade!");
		}
	}

}
