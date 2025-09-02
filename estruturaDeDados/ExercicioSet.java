package estruturaDeDados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Exercício 3 - HashSet e Set
public class ExercicioSet {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Set<Integer> conjuntosSet = new HashSet<>();

    for (int i = 0; i <= 5; i++) {
      System.out.println("Digite um número: ");
      int numeroDigitado = scanner.nextInt();

      conjuntosSet.add(numeroDigitado);
    }
    // Conjunto
    System.out.println("Os números digitados foram (sem repetir): " + conjuntosSet);

    // Perguntar outro número para verificar se está no conjunto
    System.out.print("Digite um número para verificar se está na lista: ");
    int numeroDigitado = scanner.nextInt();

    if (conjuntosSet.contains(numeroDigitado)) {
      System.out.println("O número existe na lista.");
    } else {
      System.out.println("O número não foi encontrado.");
    }

    System.out.println(conjuntosSet);

    scanner.close();

  }

}
