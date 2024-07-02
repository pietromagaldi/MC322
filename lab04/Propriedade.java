public abstract class Propriedade extends Carta{
    protected String nome;
    protected float preco;
    protected float aluguel;

    //construtor base
    public Propriedade(int id, String descricao, String nome, float preco, float aluguel){
        super(id, descricao);
        this.nome = nome;
        this.preco = preco;
        this.aluguel = aluguel;
    }

    public String getNome(){
        return nome;
    }

    public float getPreco(){
        return preco;
    }

    public float getAluguel(){
        return aluguel;
    }
    
    public abstract float calcularAluguel();

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setAluguel(float aluguel){
        this.aluguel = aluguel;
    }

}