import java.util.Scanner;

public class Menu {
    public static void andar(Jogador jogador, Scanner scanne, Tabuleiro tab){
        System.out.println("Quanto vc tirou no dado? ");
        int numero;
        while (true){
            numero = scanne.nextInt();
            if (numero < 1 || numero > 6){
                System.out.println("Digite um número entre 1 e 6.");
            }
            else{
                break;
            }
        }
        System.out.println(jogador.getNome() + " andou " + numero + " casas.");
        tab.adicionaOutput(jogador.getNome() + " andou " + numero + " casas.");
        jogador.moveCasa(numero);
    }

    public static void compra(Jogador jogador, Propriedade propriedade, Tabuleiro tab){
        if (propriedade.getDono() == null){
            if (jogador.compra(propriedade.getPreco())){
                propriedade.setDono(jogador);
                System.out.println(jogador.getNome() + " comprou a propriedade " + propriedade.getNome());
                tab.adicionaOutput(jogador.getNome() + " comprou a propriedade " + propriedade.getNome());
                System.out.println("Agora, " + jogador.getNome() + " está com " + jogador.getDinheiro() + " reais.");
            }
        }
        else{
            float aluguel = propriedade.calcularAluguel();
            if (jogador.compra(aluguel)){
                propriedade.getDono().setDinheiro(propriedade.getDono().getDinheiro()+aluguel);
                System.out.println(jogador.getNome() + " pagou " + aluguel + " a "
                 + propriedade.getDono().getNome());
                tab.adicionaOutput(jogador.getNome() + " pagou " + aluguel + " a "+ propriedade.getDono().getNome());
                System.out.println("Agora, " + jogador.getNome() + " está com " + jogador.getDinheiro() + " reais.");
                System.out.println(propriedade.getDono().getNome() + " agora está com " + propriedade.getDono().getDinheiro()
                + " reais.");
            }
            else{
                System.out.println(jogador.getNome() + " QUEBROU!");
                tab.adicionaOutput(jogador.getNome() + " QUEBROU!");
                System.exit(0);
            }
        }
    }

}
