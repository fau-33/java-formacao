public class Aluno {
    String nome;
    int idade;
    double nota1;
    double nota2;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {

        double media = (nota1 + nota2) / 2;

        return media;
    }

    public String exibirInformacoes() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: "
                + calcularMedia();
    }

}
