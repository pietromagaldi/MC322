public class Funcoes {
    private static String calculaDigitos(String cpf){ // calcula os dígitos verificadores
        int d1, d2, soma = 0, peso = 10;
        String dig1, dig2;

        // cálculo do 1° digito verificador
        for (int i = 0; i < 9; i++){
            soma += Character.getNumericValue(cpf.charAt(i)) * peso;
            peso--;
        }
        d1 = 11- (soma % 11);
        if (d1 > 9){
            d1 = 0;
        }

        // cálculo do 2° dígito verificador
        soma = 0;
        peso = 11;
        for (int i = 0; i < 10; i++){
            soma += Character.getNumericValue(cpf.charAt(i)) * peso;
            peso--;
        }
        d2 = 11- (soma % 11);
        if (d2 > 9){
            d2 = 0;
        }

        // juntei os 2 dígitos numa string para retornar tudo junto
        dig1 = Integer.toString(d1);
        dig2 = Integer.toString(d2);

        return dig1+dig2;
    }

    public static boolean validarCPF(String cpfi){
        String cpf, digitos;
        cpf = cpfi.replaceAll("\\D", ""); // tira todos os dígitos não numéricos do cpf
        digitos = calculaDigitos(cpf); // chama a função de calcular os dígitos

        // verificando se todos os dígitos são iguais
        int iguais = 0, digito = Character.getNumericValue(cpf.charAt(0));
        for (int i = 0; i < cpf.length(); i++){
            if (Character.getNumericValue(cpf.charAt(i)) == digito){
                iguais++; // se iguais == 11, então todos os números do cpf são iguais
            }
        }

        // aqui verificamos as condições para que o cpf seja válido
        if (iguais != 11 && cpf.length() == 11 && Character.getNumericValue(cpf.charAt(9)) == Character.getNumericValue(digitos.charAt(0)) 
        && Character.getNumericValue(cpf.charAt(10)) == Character.getNumericValue(digitos.charAt(1))){
            return true;
        }
        return false;
    }

    private static boolean verificaRA(String email){ // verifica se o RA é válido
        String RA = email.substring(1, 7);
        int iguais = 0, numero = Character.getNumericValue(RA.charAt(0));
        for (int i = 0; i < RA.length(); i++){
            if (Character.isLetter(RA.charAt(i))){ // caso encontre alguma letra no RA
                return false;
            }
            else if (Character.getNumericValue(RA.charAt(i)) == numero){
                iguais++;
            }
        }
        if (iguais == 6){
            return false;
        }
        return true;
    }

    public static boolean validarEmail(String email){ // verifica se um email é válido (e-mail dac unicamp)
        if (Character.isLetter(email.charAt(0)) && email.length() == 22 && email.endsWith("@dac.unicamp.br") && verificaRA(email)){
            return true;
        }
        return false;
    }
}