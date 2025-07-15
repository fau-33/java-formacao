package heranca;

public class Aviao implements ContratoVeiculo, ContratoVeiculo2 {

  @Override
  public void combustivel() {
    System.out.println("Abastecendo o avião");
  }

  @Override
  public void desligar() {
    System.out.println("O avião esta ligando");

  }

  @Override
  public void documentacao() {
    System.out.println("A documentação esta em dia !");

  }

}
