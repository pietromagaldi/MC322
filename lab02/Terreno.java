public class Terreno extends Propriedade{
    private int numeroCasas;
    private int valorCasa;
    private int valorHotel;
    private boolean hotel;

    //construtor de terreno
    public Terreno(int id, String nome, Jogador proprietario, int preco, float aluguel, int valorCasa, int valorHotel){
        super(id, nome, proprietario, preco, aluguel);
        this.valorCasa = valorCasa;
        this.valorHotel = valorHotel;
        this.hotel = false;
        this.numeroCasas = 0;
    }

    public int getNumeroCasas(){
        return numeroCasas;
    }

    public int getValorCasa(){
        return valorCasa;
    }

    public int getValorHotel(){
        return valorHotel;
    }

    public boolean getHotel(){
        return hotel;
    }

    public boolean comprarCasa(){
        // só da pra comprar casa com dinheiro suficiente, sendo 4 o limite máximo de casas
        if (!hotel && numeroCasas < 4 && proprietario.compra(valorCasa)){
            numeroCasas++;
            return true;
        }
        return false;
    }

    public boolean comprarHotel(){
        // só da pra comprar hotel com 4 casas e se tiver dinheiro suficiente
        if (!hotel && numeroCasas == 4 && proprietario.compra(valorHotel)){
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