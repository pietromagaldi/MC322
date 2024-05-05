import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Jogador> jogadores;
    private ArrayList<Propriedade> propriedades;

    // construtor de tabuleiro
    public Tabuleiro(){
        this.jogadores = new ArrayList<Jogador>();
        this.propriedades = new ArrayList<Propriedade>();
    }

    // Getters e Setters

    public ArrayList<Propriedade> getPropriedades(){
        return propriedades;
    }

    public ArrayList<Jogador> getJogador(){
        return jogadores;
    }

    // só adiciona se o jogador ainda não estiver na lista de jogadores
    public boolean addJogador(Jogador jogador){
        if (jogadores.contains(jogador)){
            return false;
        }
        jogadores.add(jogador);
        return true;
    }

    // só adiciona se a propriedade não estiver na lista de propriedades
    public boolean addPropriedade(Propriedade propriedade){
        if (propriedades.contains(propriedade)){
            return false;
        }
        propriedades.add(propriedade);
        return true;
    }

    // só remove se o jogador ja estiver na lista de jogadores
    public boolean removeJogador(Jogador jogador){
        if (!jogadores.contains(jogador)){
            return false;
        }
        jogadores.remove(jogador);
        return true;
    }

    // só remove se a propriedade ja estiver na lista de propriedades
    public boolean removePropriedade(Propriedade propriedade){
        if (!propriedades.contains(propriedade)){
            return false;
        }
        propriedades.remove(propriedade);
        return true;
    }
}