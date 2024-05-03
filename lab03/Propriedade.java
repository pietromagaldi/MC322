public abstract class Propriedade extends Carta{
    protected String nome;
    protected int preco;
    protected float aluguel;

    //construtor base
    public Propriedade(int id, String descricao, String nome, Jogador dono, int preco, float aluguel){
        super(id, descricao, dono);
        this.nome = nome;
        this.preco = preco;
        this.aluguel = aluguel;
    }

    public String getNome(){
        return nome;
    }

    public int getPreco(){
        return preco;
    }

    public float getAluguel(){
        return aluguel;
    }
    
    public float calcularAluguel(){
        return aluguel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public void setAluguel(float aluguel){
        this.aluguel = aluguel;
    }

}