import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a medida do lado A: ");
		a = leia.nextDouble();
		System.out.println("Insira a medida do lado B: ");
		b = leia.nextDouble();
		System.out.println("Insira a medida do lado C: ");
		c = leia.nextDouble();
		
		if (a >= b + c || b >= a + c || c >= a + b) {
		    System.out.println("Não é possível formar um triângulo.");
		}
		else if (a == b && b == c) {
		    System.out.println("Triângulo equilátero.");
		}
		else if (a == b || a == c || b == c) {
		    System.out.println("Triângulo isósceles.");
		}
		else {
		    System.out.println("Triângulo escaleno.");
		}
	}

	}


