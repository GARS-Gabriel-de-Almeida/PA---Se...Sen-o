import java.util.Scanner;
public class AgenciaViagens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int opcao, dias = 0;
		
		System.out.println("1- Ilha Bela 2- Fernando de Noronha. Escolha uma das opções: ");
		opcao = leia.nextInt();
		
		
		// Ilha Bela
		
		if (opcao == 1) {
			System.out.println("Por quantos dias você ficará viajando? ");
			dias = leia.nextInt();
			
			if (dias < 6) {
				System.out.println("O Valor total a ser pago é de: R$" + dias*240);
			} 
			else if (dias < 11){
				System.out.println("O Valor total a ser pago é de: R$" + ((dias*220) + 130));
			}
			else {
				System.out.println("O Valor total a ser pago é de: R$" + ((dias*210) +150));
			}
		} 
		
		
		
		// Fernando de Noronha
		
		if (opcao == 2) {
			System.out.println("Por quantos dias você ficará viajando? ");
			dias = leia.nextInt();
			
			if (dias < 6) {
				System.out.println("O Valor total a ser pago é de: R$" + ((dias*400) + 100));
			} 
			else if (dias < 11){
				System.out.println("O Valor total a ser pago é de: R$" + ((dias*410) + 150));
			}
			else {
				System.out.println("O Valor total a ser pago é de: R$" + ((dias*4220) +200));
			}
		} 
		
		
		
	}

}
