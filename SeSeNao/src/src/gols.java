package pjrGols;
	import java.util.Scanner;
public class gols {
	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	int golsB, golsA;
	
	System.out.println("Informe o numero de gols do time A: ");
		golsA = leia.nextInt();
		
	System.out.println("Informe o numero de gols do time B");
		golsB = leia.nextInt();
	if (golsA > golsB) {
		System.out.println("Time A ganhou a partida!");
	}
	if(golsA < golsB) {
		System.out.println("O time B foi o vencedor!");
	}
	if (golsA == golsB) {
		System.out.println("A partida terminou em empate!");
	}
	

	}

}
