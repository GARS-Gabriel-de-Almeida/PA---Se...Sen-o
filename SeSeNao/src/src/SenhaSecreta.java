import java.util.Scanner;
public class SenhaSecreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		String senhaSecreta, senhaDigitada;
		
		senhaSecreta = "Omg";
		
		System.out.println("Insira a senha: ");
		senhaDigitada = leia.nextLine();
		
		if (senhaSecreta .equals(senhaDigitada)) {
		 System.out.println("Acesso permitido!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}

}
