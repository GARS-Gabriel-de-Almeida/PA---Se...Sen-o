package viajanteDoTempo;

import java.util.Scanner;

public class gols {

	public gols() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int golB, golA;
			
		System.out.println("Quantos gols o time A marcou? ");
		 	golA = leia.nextInt();
		System.out.println("Quantos gols o time B marcou? ");
			golB = leia.nextInt();
		
		if (golB < golA) {
			System.out.println("Time A ganhou");
		}
			if (golA < golB) {
				System.out.println("Time B venceu");
			}
			else if (golB == golA) {
				System.out.println("O jogo terminou em empate");
			}
	}

}
