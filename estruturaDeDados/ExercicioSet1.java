package estruturaDeDados;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<String> conjuntosTreeSet = new TreeSet<>();

    for (int nomes = 0; nomes < 5; nomes++) {
      System.out.println("Digite um nome: ");
      String nomeDigitado = scanner.next();

      conjuntosTreeSet.add(nomeDigitado);
    }
    // Conjunto
    System.out.println("Os nomes digitados foram (sem repetir): " + conjuntosTreeSet);

    // Perguntar outro nome para verificar se está no conjunto
    System.out.print("Digite um nome para verificar se está na lista: ");
    String nomeDigitado = scanner.next();

    if (conjuntosTreeSet.contains(nomeDigitado)) {
      System.out.println("O nome existe na lista.");
    } else {
      System.out.println("O nome nao foi encontrado.");
    }

    conjuntosTreeSet.remove(((TreeSet<String>) conjuntosTreeSet).first());
    conjuntosTreeSet.remove(((TreeSet<String>) conjuntosTreeSet).last());

    System.out.println(conjuntosTreeSet);

    scanner.close();
  }

}
