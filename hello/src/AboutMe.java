import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args){

    try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Digite idade");
        int idade = sc.nextInt();

        System.out.println("Ola me chamo " + nome.toUpperCase() + " " + 
                            "Tenho " + idade + " anos ");
        }
        catch(InputMismatchException e){
            System.out.println("O campo idade precisa ser numerico");
        }  
         
        
        
    }
}
