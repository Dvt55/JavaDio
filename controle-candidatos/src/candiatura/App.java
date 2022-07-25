package candiatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELLA","DANIELA"};

        for(String candidato : candidatos){

        }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");


        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");

        }
        else{
            System.out.println("NÂO CONSEGUIMOS CONTATO COM " + candidato );
        }
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELLA","DANIELA"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i=0; i<candidatos.length; i++){
            System.out.println("O candidato de n" + (i+1) + "eh o " + candidatos[i+1]);
        }
        System.out.println("Forma abreviada de iteração for each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos(){

        String[] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELLA","DANIELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando demais candidatos");
        }
    }
}
