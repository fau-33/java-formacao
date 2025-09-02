package estruturaDeDados;

import java.util.LinkedList;
import java.util.Scanner;

// Exercício 2 - LinkedList
public class ExerciciosLista1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> listaDeNomes = new LinkedList<>();

    listaDeNomes.add("Paulo");
    listaDeNomes.add("Joao");
    listaDeNomes.add("Maria");
    listaDeNomes.add("Pedro");
    listaDeNomes.add("Ana");

    System.out.print("Digite um nome para verificar se está na lista: ");
    String nomeDigitado = scanner.nextLine();

    if (listaDeNomes.contains(nomeDigitado)) {
      System.out.println("O nome existe na lista.");
    } else {
      System.out.println("O nome nao foi encontrado.");
    }

    System.out.println(listaDeNomes);

    listaDeNomes.addFirst("Flávio");
    listaDeNomes.addLast("Joana");

    System.out.println(listaDeNomes);

    listaDeNomes.removeLast();
    System.out.println("O ultimo elemento foi removido da lista: " + listaDeNomes);

    System.out.println(listaDeNomes.size());
    System.out.println(listaDeNomes);

    scanner.close();

  }

}
