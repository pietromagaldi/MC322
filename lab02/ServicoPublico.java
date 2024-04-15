public class ServicoPublico extends Propriedade{ // herda da classe mãe Propriedade

    public ServicoPublico(int id, String nome, Jogador proprietario, int preco, float aluguel){
        super(id, nome, proprietario, preco, aluguel);
    }

    // Sobrecarrega o método sa classe mãe (mesmo nome, mas esse método requer parâmetros)
    public float calcularAluguel(int dados) {
        return aluguel*dados;
    }
}