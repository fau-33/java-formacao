public class CriarObjetoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "123456";
        // conta1.saldo = 400.0;

        conta1.depositar(400.0);
        System.out.println("O saldo da conta é: " + conta1.getSaldo());
        conta1.sacar(500.0);
        // System.out.println(conta1.numeroConta);
        System.out.println("O saldo da conta é: " + conta1.getSaldo());

    }

}
