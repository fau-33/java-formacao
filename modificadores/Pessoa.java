package modificadores;

/**
 * public: Visível em todo o projeto
 * private: Visível apenas dentro da classe
 * protected: Visível apenas dentro da classe e subclasses
 */

public class Pessoa {

  protected int idade;

  public void falar() {
    System.out.println("Olá ! minha idade é: " + this.idade);
  }

}
