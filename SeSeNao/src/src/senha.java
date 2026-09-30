package viajanteDoTempo;

import java.util.Scanner;

public class senha {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int an;
		
		System.out.println("Entre com o ano de nascimento");
		
		an = leia.nextInt();
		
		if (an < 1900) { 
		System.out.println("Ano digitado é invalido");
		} else if (an > 2026){
				System.out.println("Ano digitado é invalido");
		} 
		else {
			System.out.println( 2026 - an);
			}	
	}

}
