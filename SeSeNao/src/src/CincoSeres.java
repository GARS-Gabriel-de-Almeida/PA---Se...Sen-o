import java.util.Scanner;
public class CincoSeres {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idadeA, idadeB, idadeC, idadeD, idadeE, menorId = 0, maiorId = 0;
		String nomeA, nomeB, nomeC, nomeD, nomeE;
		
		System.out.println("Insira o nome da 1º pessoa: ");
		nomeA = leia.nextLine();
		System.out.println("Insira o nome da 2º pessoa: ");
		nomeB = leia.nextLine();
		System.out.println("Insira o nome da 3º pessoa: "); 
		nomeC = leia.nextLine();
		System.out.println("Insira o nome da 4º pessoa: "); 
		nomeD = leia.nextLine();
		System.out.println("Insira o nome da 5º pessoa: "); 
		nomeE = leia.nextLine();
		
		System.out.println("Insira a idade da 1º pessoa: ");
		idadeA = leia.nextInt();
		System.out.println("Insira a idade da 2º pessoa: ");
		idadeB = leia.nextInt();
		System.out.println("Insira a idade da 3º pessoa: ");
		idadeC = leia.nextInt();
		System.out.println("Insira a idade da 4º pessoa: ");
		idadeD = leia.nextInt();
		System.out.println("Insira a idade da 5º pessoa: ");
		idadeE = leia.nextInt();
		
		if (idadeA > idadeB && idadeA > idadeC && idadeA > idadeD && idadeA > idadeE) {
			maiorId = idadeA; } 
		else if (idadeB > idadeA && idadeB > idadeC && idadeB > idadeD && idadeB > idadeE) {
			maiorId = idadeB; }
		else if (idadeC > idadeA && idadeC > idadeB && idadeC > idadeD && idadeC > idadeE) {
			maiorId = idadeC; }
		else if (idadeD > idadeA && idadeD > idadeB && idadeD > idadeC && idadeD > idadeE) {
			maiorId = idadeD; }
		else if (idadeE > idadeA && idadeE > idadeB && idadeE > idadeC && idadeE > idadeD) {
			maiorId = idadeE; }
		
		if (idadeA < idadeB && idadeA < idadeC && idadeA < idadeD && idadeA < idadeE) {
			menorId = idadeA; } 
		else if (idadeB < idadeA && idadeB < idadeC && idadeB < idadeD && idadeB < idadeE) {
			menorId = idadeB; }
		else if (idadeC < idadeA && idadeC < idadeB && idadeC < idadeD && idadeC < idadeE) {
			menorId = idadeC; }
		else if (idadeD < idadeA && idadeD < idadeB && idadeD < idadeC && idadeD < idadeE) {
			menorId = idadeD; }
		else if (idadeE < idadeA && idadeE < idadeB && idadeE < idadeC && idadeE < idadeD) {
			menorId = idadeE; }
		
		if (menorId == idadeA) {
			System.out.println("Menor: " + nomeA + ", " + menorId + " anos.");
		}else if (menorId == idadeB) {
			System.out.println("Menor: " + nomeB + ", " + menorId + " anos.");
		}else if (menorId == idadeC) {
			System.out.println("Menor: " + nomeC + ", " + menorId + " anos.");
		}else if (menorId == idadeD) {
			System.out.println("Menor: " + nomeD + ", " + menorId + " anos.");
		}else if (menorId == idadeE) {
			System.out.println("Menor: " + nomeE + ", " + menorId + " anos.");
		}
		
		if (maiorId == idadeA) {
			System.out.println("Maior: " + nomeA + ", " + maiorId + " anos.");
		}else if (maiorId == idadeB) {
			System.out.println("Maior: " + nomeB + ", " + maiorId + " anos.");
		}else if (maiorId == idadeC) {
			System.out.println("Maior: " + nomeC + ", " + maiorId + " anos.");
		}else if (maiorId == idadeD) {
			System.out.println("Maior: " + nomeD + ", " + maiorId + " anos.");
		}else if (maiorId == idadeE) {
			System.out.println("Maior: " + nomeE + ", " + maiorId + " anos.");
		}
		
	}
}
	