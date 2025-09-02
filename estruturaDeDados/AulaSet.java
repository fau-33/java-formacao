package estruturaDeDados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AulaSet {
  public static void main(String[] args) {

    Set<String> conjuntosSet = new HashSet<>();

    conjuntosSet.add("Paulo");
    conjuntosSet.add("Maria");
    conjuntosSet.add("Joao");
    conjuntosSet.add("Ana");
    conjuntosSet.add("Paulo");

    // System.out.println(conjuntosSet);

    conjuntosSet.add("Maria");
    conjuntosSet.add(null);

    // System.out.println(conjuntosSet);

    // boolean contem = conjuntosSet.contains("Maria");
    // System.out.println(contem);

    Set<String> conjuntosTreeSet = new TreeSet<>();

    conjuntosTreeSet.add("Paulo");
    conjuntosTreeSet.add("Maria");
    conjuntosTreeSet.add("Joao");
    conjuntosTreeSet.add("Ana");
    conjuntosTreeSet.add("Paulo");

    conjuntosSet.add("Maria");
    conjuntosSet.add(null);

    System.out.println(conjuntosTreeSet);
  }

}
