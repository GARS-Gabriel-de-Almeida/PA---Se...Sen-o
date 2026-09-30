import java.util.Scanner;
public abstract class CalcularIMC {
	public static void main(String[] args) {
		double peso, altura;
		
		Scanner ler = new Scanner(System.in);
		
	System.out.println("Insira sua altura");
		altura = ler.nextDouble();
	System.out.println("Insira seu peso");
		peso = ler.nextDouble();
		
		if (peso/(altura*altura) < 18.5) {
			System.out.println(peso/(altura*altura) + " = Excesso de magreza");
		}else if (peso/(altura*altura) < 25) {
			System.out.println(peso/(altura*altura) + " = Peso normal");
		}else if(peso/(altura*altura) < 30){
			System.out.println(peso/(altura*altura) + " = Excesso de peso");
		}else if (peso/(altura*altura) < 35) {
			System.out.println(peso/(altura*altura) + " = Obesidade I");
		}else if (peso/(altura*altura) < 40) {
			System.out.println(peso/(altura*altura) + " = Obesidade II");
		}else {
			System.out.println(peso/(altura*altura) + " = Obesidade III");
		}
			
		
		
		
	}
}
