import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Jogador j1, j2;
        Peca peca1, peca2;
        CartaSorte cartasorte, cartareves;
        Estacao estacao;
        ServicoPublico sp;
        Terreno terr;
        Tabuleiro tab;
        
        peca1 = new Peca("verde", 0);
        peca2 = new Peca("vermelho", 0);
        
        j1 = new Jogador("Pietro", "36807256809", "32", "p236842@dac.unicamp.br", peca1);
        j2 = new Jogador("João", "11111111111", "25", "j259099@gmail.com", peca2);

        cartasorte = new CartaSorte(25, "Mova 5 casas para frente.", 5,
         1, 0, "Andar 5 casas.", 0, "nenhuma", TipoCarta.Sorte);
        cartareves = new CartaSorte(20, "Pague 20 reais ao banco", 0,
         0, 20, "Pagamento", 0, "Uso imediato", TipoCarta.Reves);

        terr = new Terreno(2, "Terreno na Avenida 1", "Avenida Romeu Tórtima",
         200, 100, 50, 100);

        sp = new ServicoPublico(1, "Limpeza", "Limpar o parque da cidade", 
        20, 50);

        estacao = new Estacao(15, "Estação de posto de gasolina",
         "Posto Ipiranga", 100, 100, 25);

        tab = new Tabuleiro();
        tab.addJogador(j1);
        tab.addJogador(j2);
        tab.addPropriedade(terr);
        tab.addPropriedade(sp);
        tab.addPropriedade(estacao);

        Scanner scanner = new Scanner(System.in);

        while (true){
            Jogador jog_da_vez;
        
            for (int i = 0; i < tab.getJogador().size(); i++){
                System.out.println("Deseja continuar? [s/n] ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("n")){
                    System.out.println(j1.getNome() + " ficou com " + j1.getDinheiro() + " reais.");
                    System.out.println(j2.getNome() + " ficou com " + j2.getDinheiro() + " reais.");
                    if (j1.getDinheiro() > j2.getDinheiro()){
                        System.out.println(j1.getNome() + " GANHOU!");
                    }
                    else if (j2.getDinheiro() > j1.getDinheiro()){
                        System.out.println(j2.getNome() + " GANHOU!");
                    }
                    else{
                        System.out.println("EMPATOU!");
                    }
                    scanner.close();
                    tab.SalvaLog();
                    System.exit(0);
                }
                jog_da_vez = tab.getJogador().get(i);
                System.out.println("Vez do jogador " + jog_da_vez.getNome());
                Menu.andar(jog_da_vez, scanner, tab);
                if (jog_da_vez.getCasa() == 1){
                    Menu.compra(jog_da_vez, terr, tab);
                }
                else if (jog_da_vez.getCasa() == 3){
                    System.out.println("Jogador caiu na casa 3, que contém o Serviço Público " + sp.getNome());
                    Menu.compra(jog_da_vez, sp, tab);
                }
                else if (jog_da_vez.getCasa() == 8){
                    System.out.println("Jogador caiu na casa 8, que contém a Estação" + estacao.getNome());
                    Menu.compra(jog_da_vez, estacao, tab);
                }
                else if (jog_da_vez.getCasa() == 7){
                    System.out.println("Jogador caiu na casa 7, que contém uma CartaSorte!");
                    System.out.println(cartasorte.getDescricao());
                    tab.distribuirCarta(jog_da_vez, cartasorte);
                    System.out.println(jog_da_vez.getNome() +  " andou 5 casas.");
                    jog_da_vez.moveCasa(cartasorte.getMovimento());
                }
                else if (jog_da_vez.getCasa() == 4){
                    System.out.println("Jogador caiu na casa 4, que contém uma CartaSorte!");
                    System.out.println(cartareves.getDescricao());
                    tab.distribuirCarta(jog_da_vez, cartareves);
                    if(cartareves.executaAcao(jog_da_vez)){
                        System.out.println(jog_da_vez.getNome() + " perdeu " + cartareves.getValor() +
                         " e agora está com " + jog_da_vez.getDinheiro() + " reais.");
                    }
                    else{
                        System.out.println(jog_da_vez.getNome() + " QUEBROU!");
                        scanner.close();
                        tab.SalvaLog();
                        System.exit(0);
                    }
                }
            System.out.println("-------------------------------------");
            }
        }
    }
}