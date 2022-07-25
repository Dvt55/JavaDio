import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        try{Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");

        int parametro1 = sc.nextInt();

        System.out.println("Digite o segundo parâmetro");

        int parametro2 = sc.nextInt();

        ImprimirNumeros(parametro1, parametro2);

        contar(parametro1, parametro2);

        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

            e.printStackTrace();
        }

        
    }
    static void ImprimirNumeros(int parametro1, int parametro2){


        for(int i=0; i<(parametro2-parametro1); i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        if(contagem <= 0){
            throw new ParametrosInvalidosException();
        }


	}
    
}
