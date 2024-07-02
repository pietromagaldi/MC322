public class Estacao extends Propriedade { // herda da classe propriedade
    private float tarifa;

    public Estacao(int id, String descricao, String nome, float preco, float aluguel, float tarifa){
        super(id, descricao, nome, preco, aluguel);
        this.tarifa = tarifa;
    }

    @Override // sobrescreve o método da classe mãe
    public float calcularAluguel() {
        return tarifa;
    }

}