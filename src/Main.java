import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o método: \n 1 - Hello World \n 2 - Calculadora básica \n 3 - Bhaskara"); // TODO Printar primeiro as opções e dps colocar o "Selecione o método:"
        int chamarMetodo = sc.nextInt();

        switch (chamarMetodo) { // FIXME Definir default (pode printar algo no console, lançar exception, algo assim)
            case 1:
                helloWorld();
                break;
            case 2:
                calculadora();
                break;
            case 3:
                bhaskara();
                break;
        }
    }

    public static void helloWorld() {
        System.out.print("Hello World");
    }

    public static void calculadora() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Selecione a função matemática: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
        int operacaoMatematica = sc.nextInt();

        switch (operacaoMatematica) { // FIXME Definir default (printar algo no console de opção inválida, lançar exception, algo assim)
            case 1:
                System.out.print(num1 + num2);
                break;
            case 2:
                System.out.print(num1 - num2);
                break;
            case 3:
                System.out.print(num1 * num2);
                break;
            case 4:
                System.out.print(num1 / num2); // FIXME Verificar se num2 != 0, caso contrário, tratar esse cenário (printar algo no console que não pode ser 0, lançar exception, algo assim)
                break;
        }

    }

    public static void bhaskara() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o A: ");
        int a = sc.nextInt();

        System.out.print("Digite o B: ");
        int b = sc.nextInt();

        System.out.print("Digite o C: ");
        int c = sc.nextInt();

        int delta = b * b - 4 * a * c;
        System.out.println("Valor de delta: " + delta);

        double raizDelta = Math.sqrt(delta); // FIXME Adicionar tratamento para, quando delta < 0, retornar que "não existe raiz"
        System.out.println("Valor da raiz de delta: " + raizDelta);

        double x1 = ((double) (-b) + raizDelta) / (double) (2 * a); // FIXME Dá pra remover esses cast pra double?
        System.out.println("Valor de x¹: " + x1);

        double x2 = ((double) (-b) - raizDelta) / (double) (2 * a); // FIXME Dá pra remover esses cast pra double?
        System.out.println("Valor de x²: " + x2);
    }
}