import java.util.Scanner;

public class Atv02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        String frase;

        do {
            System.out.println("Digite: \n1 - Continuar \n2 - Sair ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println();
                System.out.print("Digite uma frase:");
                sc.nextLine();
                frase = sc.nextLine();
                System.out.println("Texto digitado: " + frase);
                System.out.println();
            }else if (opcao == 2) {
                System.out.println("Encerrando...");
            }else {
                System.out.println("Opção Invalida!");
                System.out.println();
            }

        } while (opcao != 2);
        System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
    }
}