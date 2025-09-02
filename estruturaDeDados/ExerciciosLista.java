package estruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

// Exercício 1 - ArrayList
public class ExerciciosLista {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> listaDeNumerosInteiros = new ArrayList<>();

    listaDeNumerosInteiros.add(1);
    listaDeNumerosInteiros.add(2);
    listaDeNumerosInteiros.add(3);
    listaDeNumerosInteiros.add(4);
    listaDeNumerosInteiros.add(5);
    listaDeNumerosInteiros.add(6);

    // Pedir número ao usuário
    System.out.print("Digite um número para verificar se está na lista: ");
    int numeroDigitado = scanner.nextInt();

    // Verificar se existe na lista
    if (listaDeNumerosInteiros.contains(numeroDigitado)) {
      System.out.println("O número existe na lista.");
    } else {
      System.out.println("O número não foi encontrado.");
    }

    System.out.println(listaDeNumerosInteiros);

    listaDeNumerosInteiros.remove(0);

    System.out.println(listaDeNumerosInteiros);

    // Fechar o scanner
    scanner.close();

  }
}
