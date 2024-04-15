
public class Jogador {
    private String nome;
    private String cpf;
    private String foto;
    private String email;
    private static int n_jogadores;
    private int id;
    private int dinheiro;

    // construtor de jogador
    public Jogador(String nome, String cpf, String foto, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
        this.email = email;
        this.dinheiro = 1500;
        this.id = ++n_jogadores;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getFoto(){
        return foto;
    }

    public String getEmail(){
        return email;
    }

    public int getDinheiro(){
        return dinheiro;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setFoto(String foto){
        this.foto = foto;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDinheiro(int dinheiro){
        this.dinheiro = dinheiro;
    }

    // se tiver dinheiro suficiente, compra, altera o dinheiro e retorna true. Senão, não compra e retorna false
    public boolean compra(int valor){
        if (this.dinheiro < valor){
            return false;
        }
        dinheiro -= valor;
        return true;
    }

    // toString para printar os dados do jogador
    public String toString(){
        return "Nome: " + nome + "\nCpf: " + cpf + "\nFoto: " + foto + "\nEmail: " + email + "\nId: " + id + 
        "\nDinheiro: " + dinheiro + "\n";
    }
}