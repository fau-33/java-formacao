package exercicio_abstract;

public class Cachorro extends Animal {
  String raca;
  String cor;

  public Cachorro(String nome, String raca, String cor) {
    super(nome);
    this.raca = raca;
    this.cor = cor;
  }

  public Cachorro(String nome) {
    super(nome);
  }

  @Override
  public void emitirSom() {
    System.out.println(nome + " está latindo");
  }

  @Override
  public void mover() {
    System.out.println("O cachorro está se movendo");
  }

  public void mostrarInformacoes() {
    System.out.println("Raça: " + this.raca);
    System.out.println("Cor: " + this.cor);
  }

}
