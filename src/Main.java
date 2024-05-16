import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o método: \n 1 - Hello World \n 2 - Calculadora básica \n 3 - Bhaskara");
        int chamarMetodo = sc.nextInt();

        switch (chamarMetodo) {
            case 1:
                helloWorld();
                break;
            case 2:
                calculadora();
                break;
            case 3:
                bhaskara();
                break;
            default:
                throw new RuntimeException("Valor inválido");
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

        switch (operacaoMatematica) {
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
                if (num2 == 0) {
                    throw new RuntimeException("Não é possível fazer divisão por 0");
                }
                System.out.print(num1 / num2);
                break;
            default:
                throw new RuntimeException("Valor inválido");
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

        if (delta <= 0) {
            throw new RuntimeException("Não existe raiz de número negativo");
        }

        double raizDelta = Math.sqrt(delta);
        System.out.println("Valor da raiz de delta: " + raizDelta);

        double x1 = ((-b) + raizDelta) / (2 * a);
        System.out.println("Valor de x¹: " + x1);

        double x2 = ((-b) - raizDelta) / (2 * a);
        System.out.println("Valor de x²: " + x2);
    }
}