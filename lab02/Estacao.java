public class Estacao extends Propriedade { // herda da classe propriedade

    public Estacao(int id, String nome, Jogador proprietario, int preco, float aluguel){
        super(id, nome, proprietario, preco, aluguel);
    }

    @Override // sobrescreve o método da classe mãe
    public float calcularAluguel() {
        return aluguel;
    }

}