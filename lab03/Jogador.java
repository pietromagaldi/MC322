import java.util.ArrayList;

public class Jogador {
    private String nome;
    private String cpf;
    private String foto;
    private String email;
    private static int n_jogadores;
    private int id;
    private int dinheiro;
    private Peca peca;
    private ArrayList<Carta> cartas;

    // construtor de jogador
    public Jogador(String nome, String cpf, String foto, String email, Peca peca){
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
        this.email = email;
        this.dinheiro = 1500;
        this.id = ++n_jogadores;
        this.peca = peca;
        cartas = new ArrayList<>();
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

    public Peca getPeca(){
        return peca;
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

    public void setPeca(Peca peca){
        this.peca = peca;
    }

    // se tiver dinheiro suficiente, compra, altera o dinheiro e retorna true. Senão, não compra e retorna false
    public boolean compra(int valor){
        if (this.dinheiro < valor){
            return false;
        }
        dinheiro -= valor;
        return true;
    }

    // adiciona uma carta à lista de cartas do jogador
    public boolean adicionaCarta(Carta carta){
        cartas.add(carta);
        return true;
    }

    private String imprimeCartas(){
        String impressao = "";
        for(int i=0; i < this.cartas.size(); i++){
            impressao += this.cartas.get(i).getId() + "; ";
        }
        return impressao;
    }

    // toString para printar os dados do jogador
    public String toString(){
        return "Nome: " + nome + "\nCpf: " + cpf + "\nFoto: " + foto + "\nEmail: " + email + "\nId: " + id + 
        "\nDinheiro: " + dinheiro + "\nPeça - Cor: " + peca.getCor() + ", Posicao: " + peca.getPosicao() + "\nCartas(id): " + imprimeCartas() + "\n";
    }
}