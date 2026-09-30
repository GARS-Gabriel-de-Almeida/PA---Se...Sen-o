import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double A, B, C, delta, x1, x2;

        System.out.print("Digite o valor de A: ");
        A = ler.nextDouble();

        System.out.print("Digite o valor de B: ");
        B = ler.nextDouble();

        System.out.print("Digite o valor de C: ");
        C = ler.nextDouble();

        if (A == 0) {
            System.out.println("Não é uma equação de segundo grau.");
        } else {
            delta = B * B - 4 * A * C;

            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else if (delta == 0) {
                x1 = -B / (2 * A);
                System.out.println("Existe apenas uma raiz real: " + x1);
            } else {
                x1 = (-B + Math.sqrt(delta)) / (2 * A);
                x2 = (-B - Math.sqrt(delta)) / (2 * A);
                System.out.println("As duas raízes reais são: " + x1 + " e " + x2);
            }
        }

    }
}
