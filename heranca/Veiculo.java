package heranca;

public abstract class Veiculo {
  String marca;

  public Veiculo(String marca) {
    this.marca = marca;
  }

  public abstract void ligar();

  void mostrarDetalhes() {
    System.out.println("Marca: " + this.marca);
  }

}
