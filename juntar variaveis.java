import java.util.Scanner; // importa a classe Scanner que permite ler dados digitados pelo usuário

public class Calculadora { // declara a classe chamada Calculadora (todo programa Java precisa estar dentro de uma classe)

    public static void main(String[] args) { // método principal onde o programa começa a executar

        Scanner scanner = new Scanner(System.in); // cria um objeto Scanner para ler dados do teclado

        System.out.print("Digite o primeiro número: "); // mostra uma mensagem pedindo o primeiro número

        int num1 = scanner.nextInt(); // lê um número inteiro digitado pelo usuário e guarda na variável num1

        System.out.print("Digite o segundo número: "); // mostra uma mensagem pedindo o segundo número

        int num2 = scanner.nextInt(); // lê outro número inteiro digitado e guarda na variável num2

        int soma = num1 + num2; // realiza a soma dos dois números e guarda o resultado na variável soma

        System.out.println("A soma é: " + soma); // mostra o resultado da soma na tela

        scanner.close(); // fecha o Scanner para liberar o recurso de leitura do teclado

    }

}
