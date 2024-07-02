import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Tabuleiro implements Salvavel{
    private ArrayList<Jogador> jogadores;
    private ArrayList<Propriedade> propriedades;
    private ArrayList<CartaSorte> cartas;
    private String output;

    // construtor de tabuleiro
    public Tabuleiro(){
        this.jogadores = new ArrayList<Jogador>();
        this.propriedades = new ArrayList<Propriedade>();
        this.cartas = new ArrayList<CartaSorte>();
    }

    // Getters e Setters

    public ArrayList<Propriedade> getPropriedades(){
        return propriedades;
    }

    public ArrayList<Jogador> getJogador(){
        return jogadores;
    }

    // altera a sting usada no output
    public void adicionaOutput(String string){
        this.output += string + "\n";
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

    // só adiciona se a carta não estiver na lista de cartas
    public boolean addCarta(CartaSorte carta){
        if (cartas.contains(carta)){
            return false;
        }
        cartas.add(carta);
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

    // só remove se a carta ja estiver na lista de cartas
    public boolean removeCarta(CartaSorte carta){
        if (!cartas.contains(carta)){
            return false;
        }
        cartas.remove(carta);
        return true;
    }

    // no final do jogo, escreve todo o log de ações no arquivo "output.txt"
    public void SalvaLog(){
        String filename = "output.txt";
        BufferedWriter out = null;
        try{
            out = new BufferedWriter(new FileWriter(filename));
            out.write(output);
            out.flush();
        }
        catch (Exception e){
            System.out.println("Erro");
        }
        finally{
            try{
                if (out != null){
                    out.close();
                }
            }
            catch(Exception e){
                System.out.println("Erro");
            }
        }
    }

    public void distribuirCarta(Jogador jogador, CartaSorte carta){
        carta.setDono(jogador);
        jogador.adicionaCarta(carta);
    }
}