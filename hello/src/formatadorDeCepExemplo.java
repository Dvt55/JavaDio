public class formatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatCep("2345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
                System.out.println("Cep Invalido");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static String formatCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
}