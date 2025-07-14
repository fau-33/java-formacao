package heranca;

public class Moto extends Veiculo {

  String cilindrada;
  
  public Moto(String marca, String cilindrada) {
    super(marca);
    this.cilindrada = cilindrada;
  }

  @Override
  public void ligar() {
    
    System.out.println("A moto esta ligando");
    System.out.println("A cilindrada da moto é: " + this.cilindrada);
  }
}
