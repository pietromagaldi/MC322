public class Terreno extends Propriedade{
    private int numeroCasas;
    private float valorCasa;
    private float valorHotel;
    private boolean hotel;

    //construtor de terreno
    public Terreno(int id, String descricao, String nome, float preco, float aluguel, float valorCasa, float valorHotel){
        super(id, descricao, nome, preco, aluguel);
        this.valorCasa = valorCasa;
        this.valorHotel = valorHotel;
        this.hotel = false;
        this.numeroCasas = 0;
    }

    public int getNumeroCasas(){
        return numeroCasas;
    }

    public float getValorCasa(){
        return valorCasa;
    }

    public float getValorHotel(){
        return valorHotel;
    }

    public boolean getHotel(){
        return hotel;
    }

    public boolean comprarCasa(){
        // só da pra comprar casa com dinheiro suficiente, sendo 4 o limite máximo de casas
        if (!hotel && numeroCasas < 4 && dono.compra(valorCasa)){
            numeroCasas++;
            return true;
        }
        return false;
    }

    public boolean comprarHotel(){
        // só da pra comprar hotel com 4 casas e se tiver dinheiro suficiente
        if (!hotel && numeroCasas == 4 && dono.compra(valorHotel)){
            numeroCasas = 0;
            return true;
        }
        return false;
    }
    
    @Override // sobrescrita do método da classe mãe
    public float calcularAluguel(){
        float soma = aluguel + (100 * numeroCasas);
        if (hotel){
            soma += 1000;
        }
        return soma;
    }
}