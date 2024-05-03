public class Peca {
    private String cor;
    private int posicao;

    public Peca(String cor, int posicao){ //construtor de peça
        this.cor = cor;
        this.posicao = posicao;
    }

    public String toString(){
        return "Cor: " + cor + "\nPosição: " + posicao + "\n";
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public String getCor(){
        return cor;
    }

    public int getPosicao(){
        return posicao;
    }
}