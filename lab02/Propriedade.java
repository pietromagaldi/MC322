public class Propriedade {
    protected int id;
    protected String nome;
    protected Jogador proprietario;
    protected int preco;
    protected float aluguel;

    //construtor base
    public Propriedade(int id, String nome, Jogador proprietario, int preco, float aluguel){
        this.id = id;
        this.nome = nome;
        this.proprietario = proprietario;
        this.preco = preco;
        this.aluguel = aluguel;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Jogador getProprietario(){
        return proprietario;
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

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setProprietario(Jogador proprietario){
        this.proprietario = proprietario;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public void setAluguel(float aluguel){
        this.aluguel = aluguel;
    }

}