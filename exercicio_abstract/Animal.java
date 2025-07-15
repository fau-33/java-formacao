package exercicio_abstract;

public abstract class Animal {

  String nome;

  public Animal(String nome) {
    this.nome = nome;
  }

  public void mover() {
    System.out.println(nome + " está se movendo");
  }

  public abstract void emitirSom();

}
