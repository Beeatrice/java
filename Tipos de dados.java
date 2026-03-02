public class Main {

    // Função
    public static void mostrarDados(String nome, int idade, double altura, boolean maiorDeIdade) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Maior de idade: " + maiorDeIdade);
    }

    public static void main(String[] args) {

        String nome = "Beatriz";
        int idade = 22;
        double altura = 1.56;
        boolean maiorDeIdade = true;

        // Chamando a função
        mostrarDados(nome, idade, altura, maiorDeIdade);
    }
}
