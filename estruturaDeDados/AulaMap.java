package estruturaDeDados;

import java.util.Map;
import java.util.TreeMap;

public class AulaMap {
  public static void main(String[] args) {
    Map<String, String> contatosMap = new TreeMap<>();

    contatosMap.put("Paulo", "1234-5678");
    contatosMap.put("Maria", "9987-6543");
    contatosMap.put("Joao", "1234-5678");
    contatosMap.put("Ana", "1234-5678");
    contatosMap.put("Paulo", "1234-5678");

    // System.out.println("O numero de Maria eh: " + contatosMap.get("Maria"));

    for (Map.Entry<String, String> entry : contatosMap.entrySet()) {
      System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
    }

  }

}
