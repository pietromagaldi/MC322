import java.util.Random;

public class ServicoPublico extends Propriedade{ // herda da classe mãe Propriedade
    private int multi;

    public ServicoPublico(int id, String nome, String descricao, float preco, float aluguel){
        super(id, descricao, nome, preco, aluguel);
    }

    public int getMulti(){
        return multi;
    }

    // Sobrecarrega o método da classe mãe (mesmo nome, mas esse método requer parâmetros)
    public float calcularAluguel(){
        Random random = new Random();
        int multi = random.nextInt(6) + 1;
        System.out.println("Numero aleatório do dado: " + multi);     
        return multi*aluguel;
    }
}