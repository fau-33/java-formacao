package heranca;

public class Carro extends Veiculo {
  int numeroDePortas;
  boolean temArcondionado;
  
  

  public Carro(int numeroDePortas, boolean temArcondionado, String marca) {
    super(marca);
    this.numeroDePortas = numeroDePortas;
    this.temArcondionado = temArcondionado;
    
  }

  @Override
  public void ligar() {
    super.ligar();
    System.out.println("O carro esta ligado");
    
  }
}
