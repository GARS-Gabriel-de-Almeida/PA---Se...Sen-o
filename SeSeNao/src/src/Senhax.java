import java.util.Scanner;
public class Senha {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		String senha = "67Aura", senhaUsuario;
		
		System.out.println("Entre com a sua senha: ");
		senhaUsuario = leia.next();
		
		if (senha.equalsIgnoreCase (senhaUsuario)) {
			System.out.println("Senha correta.");
		}else {
			System.out.println("Senha incorreta.");
		}
	}
	
}
