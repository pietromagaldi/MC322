public class ServicoPublico extends Propriedade{ // herda da classe mãe Propriedade

    public ServicoPublico(int id, String nome, String descricao, Jogador dono, int preco, float aluguel){
        super(id, descricao, nome, dono, preco, aluguel);
    }

    // Sobrecarrega o método sa classe mãe (mesmo nome, mas esse método requer parâmetros)
    public float calcularAluguel(int dados) {
        return aluguel*dados;
    }
}