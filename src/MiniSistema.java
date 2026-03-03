import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniSistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int numero;

        while (opcao != 3) {
            System.out.println("1 - Tabuada");
            System.out.println("2 - Par ou Impar");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opcao: ");

            try {
                 opcao = input.nextInt();

                switch (opcao) {

                    case 1:

                        System.out.println("Digite um numero");
                        numero = input.nextInt();
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numero + " x " + i + " = " + numero * i);
                        }
                        break;

                    case 2:
                        System.out.println("Digite um numero:");
                        numero = input.nextInt();
                        if (numero % 2 == 0) {
                            System.out.println(numero + " e par.");
                        } else {
                            System.out.println(numero + " e impar.");
                        }
                        break;

                    case 3:
                        System.out.println("Saindo do sistema...");

                        break;
                    default:
                        System.out.println("Opcao invalida!");

                }
            }catch (InputMismatchException e) {
                System.out.println("Voce digitou algo que nao e numero!");
                input.nextLine();

            }
        }input.close();
    }
}
