public class Estacao extends Propriedade { // herda da classe propriedade

    public Estacao(int id, String descricao, String nome, Jogador dono, int preco, float aluguel){
        super(id, descricao, nome, dono, preco, aluguel);
    }

    @Override // sobrescreve o método da classe mãe
    public float calcularAluguel() {
        return aluguel;
    }

}