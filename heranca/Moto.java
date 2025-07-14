package heranca;

public class Moto extends Veiculo {
  int cilindradas;
  boolean temPartidaEletrica;

  public Moto(int cilindradas, boolean temPartidaEletrica, String marca) {
    super(marca);
    this.cilindradas = cilindradas;
    this.temPartidaEletrica = temPartidaEletrica;
  }

}
