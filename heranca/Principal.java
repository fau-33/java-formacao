package heranca;

public class Principal {

  public static void main(String[] args) {
    // Carro carro = new Carro(4, true, "Fiat");
    // carro.ligar();

    // Moto moto = new Moto("Honda", "350cc");
    // moto.ligar();

    Veiculo carro = new Carro(2, false, "Fiat");
    carro.ligar();
    carro.mostrarDetalhes();
  }

}
