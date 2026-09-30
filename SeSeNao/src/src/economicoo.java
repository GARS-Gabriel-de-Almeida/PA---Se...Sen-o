import java.util.Scanner;

public class economico {

	public static void main(String[] args) {
		double km, litros, gasto;
		
		Scanner ler = new Scanner(System.in); 
		
			System.out.println("Informe a distância percorrida: ");
				km = ler.nextDouble();
		
			System.out.println("Insira a capacidade do tanque de combustivel: ");
				litros = ler.nextDouble();
		
		gasto = km / litros;
		
		System.out.println("O gasto de combustivel foi: " + gasto );
		
		if (gasto >= 10) {
			System.out.println("Seu carro é ecônomico!");
		} else {
			System.out.println("Seu carro não é ecônomico!");
		}
		
		
		
	}

}
