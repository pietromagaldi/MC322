public class Main {
    public static void main(String[] args){
        Jogador j1, j2;
        Peca peca;
        CartaSorte carta;
        Estacao estacao;
        ServicoPublico sp;
        Terreno terr;
        Tabuleiro tab;

        carta = new CartaSorte(25, "Mova 5 casas para frente.", 5, 1,
        0, "Andar 5 casas.", 0, "nenhuma");

        peca = new Peca("verde", 0);

        j1 = new Jogador("Pietro", "36807256809", "32", "p236842@dac.unicamp.br");
        j2 = new Jogador("João", "11111111111", "25", "j259099@gmail.com");

        terr = new Terreno(2, "Avenida Romeu Tórtima", j1, 200, 100, 50, 100);

        sp = new ServicoPublico(1, "Doação", j2, 20, 50);

        estacao = new Estacao(15, "Posto Ipiranga", j1, 100, 100);

        tab = new Tabuleiro();
        tab.addJogador(j1);
        tab.addJogador(j2);
        tab.removeJogador(j2);
        tab.addPropriedade(terr);
        tab.addPropriedade(sp);
        tab.addPropriedade(estacao);

        System.out.println(j1.toString());
        System.out.println(j2.toString());
        System.out.println(peca.toString());
        System.out.println(carta.toString());
        
        System.out.println("O aluguel do Serviço público de nome " + sp.getNome() + ", quando se tira 3 no dado, é " + sp.calcularAluguel(3));

        System.out.println("O aluguel da estação de id " + estacao.getId() + " é " + estacao.calcularAluguel());

        terr.comprarCasa();

        System.out.println("O aluguel do terreno de nome " + terr.getNome() + " é " + terr.calcularAluguel());
        System.out.println("O dinheiro de " + terr.getProprietario().getNome() + " após comprar uma casa no terreno "
        + terr.getNome() + " é de " + terr.getProprietario().getDinheiro() + "\n");

        System.out.println(j1.toString());

        if (Funcoes.validarCPF(j1.getCpf())){
            System.out.println("Cpf do Jogador 1 é válido!");
        }
        else{
            System.out.println("Cpf do Jogador 1 é inválido!");
        }
        if (Funcoes.validarEmail(j1.getEmail())){
            System.out.println("Email do Jogador 1 é válido!");
        }
        else{
            System.out.println("Email do Jogador 1 é inválido!");
        }
        if (Funcoes.validarCPF(j2.getCpf())){
            System.out.println("Cpf do Jogador 2 é válido!");
        }
        else{
            System.out.println("Cpf do Jogador 2 é inválido!");
        }
        if (Funcoes.validarEmail(j2.getEmail())){
            System.out.println("Email do Jogador 2 é válido!");
        }
        else{
            System.out.println("Email do Jogador 2 é inválido!");
        }
    }
}