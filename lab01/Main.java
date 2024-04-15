public class Main {
    public static void main(String[] args){
        Jogador j1, j2;
        Peca peca;
        CartaSorte carta;

        carta = new CartaSorte(25, "Mova 5 casas para frente.", 5, 1,
        0, "Andar 5 casas.", 0, "nenhuma");

        peca = new Peca("verde", 0);

        j1 = new Jogador("Pietro", "36807256809", "32", "p236842@dac.unicamp.br");
        j2 = new Jogador("João", "11111111111", "25", "j259099@gmail.com");

        System.out.println(j1.toString());
        System.out.println(j2.toString());
        System.out.println(peca.toString());
        System.out.println(carta.toString());
        
        if (j1.validarCPF()){
            System.out.println("Cpf do Jogador 1 é válido!");
        }
        else{
            System.out.println("Cpf do Jogador 1 é inválido!");
        }
        if (j1.validarEmail()){
            System.out.println("Email do Jogador 1 é válido!");
        }
        else{
            System.out.println("Email do Jogador 1 é inválido!");
        }
        if (j2.validarCPF()){
            System.out.println("Cpf do Jogador 2 é válido!");
        }
        else{
            System.out.println("Cpf do Jogador 2 é inválido!");
        }
        if (j2.validarEmail()){
            System.out.println("Email do Jogador 2 é válido!");
        }
        else{
            System.out.println("Email do Jogador 2 é inválido!");
        }
    }
}