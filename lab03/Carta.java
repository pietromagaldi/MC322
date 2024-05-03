public abstract class Carta {
    protected int id;
    protected String descricao;
    protected Jogador dono;

    public Carta(int id, String descricao, Jogador dono){
        this.id = id;
        this.descricao = descricao;
        this.dono = dono;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setDono(Jogador jogador){
        this.dono = jogador;
    }

    public int getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
    }

    public Jogador getDono(){
        return dono;
    }
}
