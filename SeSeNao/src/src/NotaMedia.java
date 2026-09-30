import java.util.Scanner;
public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, media, ntExame, novaMedia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Insira a 1º Nota: ");
		nota1 = leia.nextDouble();
		System.out.println(" Insira a 2º Nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media < 3) {
		    System.out.println(media + " REPROVADO!");
		}
		else if (media >= 6) {
		    System.out.println(media + " APROVADO!");
		}
		else {
		    System.out.println(media + " ALUNO EM EXAME!");

		    System.out.println("Insira a nota do exame:");
		    ntExame = leia.nextDouble();

		    novaMedia = (media + ntExame) / 2;

		    if (novaMedia >= 6) {
		        System.out.println(novaMedia + " APROVADO!");
		    } else {
		        System.out.println(novaMedia + " REPROVADO!");
		}
	}
}