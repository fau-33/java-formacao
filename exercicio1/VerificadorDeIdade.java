public class VerificadorDeIdade {
    public static void main(String[] args) {
        int idade = 45;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

    }
}
