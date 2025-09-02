package estruturaDeDados;

import java.util.ArrayList;
import java.util.LinkedList;

public class AulaLista {
  public static void main(String[] args) {
    ArrayList<String> listaSequencial = new ArrayList<>();
    listaSequencial.add("Paulo");
    listaSequencial.add("Joao");
    listaSequencial.add("Maria");
    listaSequencial.add("Pedro");
    listaSequencial.add("Ana");
    listaSequencial.add("Lucas");
    listaSequencial.add("Julia");

    // System.out.println(listaSequencial);

    // listaDeNomes.remove(0);
    // listaSequencial.remove("Julia");

    // System.out.println(listaSequencial.size());

    LinkedList<String> listaEncadeada = new LinkedList<>();
    listaEncadeada.add("Paulo");
    listaEncadeada.add("Joao");
    listaEncadeada.add("Maria");

    // System.out.println(listaEncadeada);

    listaEncadeada.addFirst("Julia");
    listaEncadeada.addLast("Pedro");

    System.out.println("Peek first: " + listaEncadeada.peekFirst());
    System.out.println("Get first': " + listaEncadeada.getFirst());
    listaEncadeada.pollFirst();
    System.out.println(listaEncadeada);

    boolean contemNome = listaEncadeada.contains("Maria");
    System.out.println("Contem nome: " + contemNome);

    int indice = listaEncadeada.indexOf("Maria");
    System.out.println("Indice: " + indice);

  }
}
