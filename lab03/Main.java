import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Jogador j1, j2;
        Peca peca1, peca2;
        CartaSorte cartasorte;
        Estacao estacao;
        ServicoPublico sp;
        Terreno terr;
        Tabuleiro tab;
        
        peca1 = new Peca("verde", 0);
        peca2 = new Peca("vermelho", 0);
        
        j1 = new Jogador("Pietro", "36807256809", "32", "p236842@dac.unicamp.br", peca1);
        j2 = new Jogador("João", "11111111111", "25", "j259099@gmail.com", peca2);

        cartasorte = new CartaSorte(25, "Mova 5 casas para frente.", j1, 5, 1, 0, "Andar 5 casas.", 0, "nenhuma");
        j1.adicionaCarta(cartasorte);

        terr = new Terreno(2, "Terreno na Avenida 1", "Avenida Romeu Tórtima", j1, 200, 100, 50, 100);

        sp = new ServicoPublico(1, "Limpeza", "Limpar o parque da cidade", j2, 20, 50);

        estacao = new Estacao(15, "Estação de posto de gasolina", "Posto Ipiranga", j1, 100, 100);

        tab = new Tabuleiro();
        tab.addJogador(j1);
        tab.addJogador(j2);
        tab.removeJogador(j2);
        tab.addPropriedade(terr);
        tab.addPropriedade(sp);
        tab.addPropriedade(estacao);

        terr.comprarCasa();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Deseja ver uma informação de propriedade ou jogador? (ou 'sair' para encerrar) ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")){
                break;
            }
            
            else if (input.equalsIgnoreCase("propriedade")){
                System.out.println("Qual o nome da propriedade que deseja ver? ");
                input = scanner.nextLine();
                for (int i=0; i < tab.getPropriedades().size(); i++){
                    if (tab.getPropriedades().get(i).getNome().equalsIgnoreCase(input)){
                        System.out.println(tab.getPropriedades().get(i).toString());
                    }
                }
            }

            else if (input.equalsIgnoreCase("jogador")){
                System.out.println("Qual o nome do jogador que deseja ver? ");
                input = scanner.nextLine();
                for (int i=0; i < tab.getJogador().size(); i++){
                    if (tab.getJogador().get(i).getNome().equalsIgnoreCase(input)){
                        System.out.println(tab.getJogador().get(i).toString());
                    }
                }
            }

            else {
                System.out.println("Digite uma opção válida.");
            }
        }
        scanner.close();
    }
}