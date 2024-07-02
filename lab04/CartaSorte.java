public class CartaSorte extends Carta{
    private int movimento;
    private int efeito;
    private float valor;
    private String acao;
    private int tempo;
    private String restricao;
    private final TipoCarta tipo;

    //construtor de cartasorte
    public CartaSorte(int id, String descricao, int movimento, int efeito, float valor, String acao, 
    int tempo, String restricao, TipoCarta tipo){
        super(id, descricao);
        this.movimento = movimento;
        this.efeito = efeito;
        this.valor = valor;
        this.acao = acao;
        this.tempo = tempo;
        this.restricao = restricao;
        this.tipo = tipo;
    }

    public void setMovimento(int movimento){
        this.movimento = movimento;
    }

    public void setEfeito(int efeito){
        this.efeito = efeito;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public void setAcao(String acao){
        this.acao = acao;
    }

    public void setTempo(int tempo){
        this.tempo = tempo;
    }
    
    public void setRestricao(String restricao){
        this.restricao = restricao;
    }

    public int getMovimento(){
        return movimento;
    }

    public int getEfeito(){
        return efeito;
    }

    public float getValor(){
        return valor;
    }

    public String getAcao(){
        return acao;
    }

    public int getTempo(){
        return tempo;
    }

    public String getRestricao(){
        return restricao;
    }

    public TipoCarta getTipo(){
        return tipo;
    }

    public boolean executaAcao(Jogador jogador){
        if(jogador.compra(valor)){
            return true;
        }
        return false;
    }
}