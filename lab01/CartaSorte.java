public class CartaSorte {
    private int id;
    private String descricao;
    private int movimento;
    private int efeito;
    private float valor;
    private String acao;
    private int tempo;
    private String restricao;

    public CartaSorte(int id, String descricao, int movimento, int efeito, float valor, String acao, int tempo, String restricao){
        this.id = id;
        this.descricao = descricao;
        this.movimento = movimento;
        this.efeito = efeito;
        this.valor = valor;
        this.acao = acao;
        this.tempo = tempo;
        this.restricao = restricao;
    }

    public String toString(){
        return "Id: " + id + "\nDescrição: " + descricao + "\nMovimento: " + movimento + "\nEfeito: "
        + efeito + "\nValor: " + valor + "\nAção: " + acao + "\nTempo: " + tempo + "\nRestrição: " + restricao
        + "\n";
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
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

    public int getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
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
}
