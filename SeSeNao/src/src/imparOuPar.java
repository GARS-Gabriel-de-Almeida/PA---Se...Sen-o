import java.util.Scanner;
public class imparOuPar {
	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Digite um número inteiro: ");
        n = leia.nextInt();

		if (n % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

    }

}
