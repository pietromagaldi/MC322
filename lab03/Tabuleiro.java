import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Jogador> jogadores;
    private ArrayList<Propriedade> propriedades;

    // construtor de tabuleiro
    public Tabuleiro(){
        this.jogadores = new ArrayList<Jogador>();
        this.propriedades = new ArrayList<Propriedade>();
    }

    // verifica se um objeto específico está no array de parâmetro
    private static boolean ta_no_array(ArrayList<?> array, Object objeto){
        int i;
        for (i = 0; i < array.size(); i++){
            if (array.get(i) == objeto){
                return false;
            }
        }
        return true;
    }

    // só adiciona se o jogador ainda não estiver na lista de jogadores
    public boolean addJogador(Jogador jogador){
        if (ta_no_array(jogadores, jogador)){
            return false;
        }
        jogadores.add(jogador);
        return true;
    }

    // só adiciona se a propriedade não estiver na lista de propriedades
    public boolean addPropriedade(Propriedade propriedade){
        if (ta_no_array(propriedades, propriedade)){
            return false;
        }
        propriedades.add(propriedade);
        return true;
    }

    // só remove se o jogador ja estiver na lista de jogadores
    public boolean removeJogador(Jogador jogador){
        if (!ta_no_array(jogadores, jogador)){
            return false;
        }
        jogadores.remove(jogador);
        return true;
    }

    // só remove se a propriedade ja estiver na lista de propriedades
    public boolean removePropriedade(Propriedade propriedade){
        if (!ta_no_array(propriedades, propriedade)){
            return false;
        }
        propriedades.remove(propriedade);
        return true;
    }
}