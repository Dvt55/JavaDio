// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem {
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome[] = new String [1000];
		

// TODO: complete os espaços em branco com sua solução para o problema
		leitor.nextLine();
		for (int i = 0; i < C; i++) {
			nome[i] = leitor.nextLine();
			
			
			
		}
		for(int i=0; i<C; i++){
			if(nome[i].charAt(0) == 'T' && nome[i].charAt(1) == 'h' && nome[i].charAt(2) == 'o' && nome[i].charAt(3) == 'r' && nome[i].charAt(4) == ' '){ System.out.println(   "Y"      );}
			
			else System.out.println(  "N"         );
		}
    }
	
}