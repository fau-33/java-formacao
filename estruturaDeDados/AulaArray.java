package estruturaDeDados;

public class AulaArray {
  public static void main(String[] args) {
    // int[] array = new int[8];

    // array[0] = 1;
    // array[1] = 2;
    // array[2] = 3;
    // array[3] = 4;
    // array[4] = 5;
    // array[5] = 6;
    // array[6] = 7;
    // array[7] = 8;

    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
    System.out.println(array[0]);

    int tamanhoDoArray = array.length;
    System.out.println("O tamanho do array é: " + tamanhoDoArray);

    for (int i = 0; i < tamanhoDoArray; i++) {
      System.out.println(array[i]);
    }
  }

}
