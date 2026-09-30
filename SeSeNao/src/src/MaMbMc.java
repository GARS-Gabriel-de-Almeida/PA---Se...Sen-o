import java.util.Scanner;
public class MaMbMc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double a, b, c, menor = 0, medio = 0, maior = 0;
		
		System.out.println("Insira o valor A: ");
		a = leia.nextDouble();
		System.out.println("Insira o valor B: ");
		b = leia.nextDouble();
		System.out.println("Insira o valor C: "); 
		c = leia.nextDouble();
		
		if (a < b && a < c) {
			menor = a;
		}else if (b < a  && b < c) {
			menor = b;
		}else if (c < b && c < a) {
			menor = c;
		} 
		if (a > b && a < c || a < b && a > c  ) {
			medio = a;
		}else if (b > a && b < c || b < a && b > c  ) {
			medio = b;
		}else if (c > b && c < a || c < b && c > a  ) {
			medio = c;
		}
		if (a > b && a > c) {
			maior = a;
		}else if (b > a && b > c) {
			maior = b;
		}else if (c > b && c > a) {
			maior = c;
		}
		System.out.println("Menor: " + menor);
		System.out.println("Médio: " + medio);
		System.out.println("Maior: " + maior);
		
	}
}
