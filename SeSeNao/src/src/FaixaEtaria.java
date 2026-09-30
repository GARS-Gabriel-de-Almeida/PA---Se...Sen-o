import java.util.Scanner; 

public class FaixaEtaria { 
    public static void main(String[] args) { 
        Scanner ler = new Scanner(System.in); 
        int an, aa, id; 
        
        System.out.println("Entre com o ano de nascimento: "); 
        an = ler.nextInt(); 
        
        System.out.println("Entre com o ano atual: "); 
        aa = ler.nextInt(); 
        
        id = aa - an; 
        
        System.out.println("Sua idade é " + id + " anos"); 
        
        if (id < 10) { 
            System.out.println("Aproveite! você é criança!"); 
        } else if (id < 18) { 
            System.out.println("Adolescente!"); 
        } else if (id < 60) { 
            System.out.println("Adulto"); 
        } else { 
            System.out.println("Idoso"); 
        } 
    }
}
	
