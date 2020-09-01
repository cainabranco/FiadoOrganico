package fiado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do cliente: ");

        String nome = scanner.nextLine();
        Consumidor consumidor = new Consumidor(nome);

        System.out.print("Informe o valor da compra: ");
        int fiado = Integer.parseInt(scanner.nextLine());
        consumidor.registrarFiado(fiado);

        int total = consumidor.getFiados();

        System.out.println("Cliente " + consumidor.getNome() + " deve: " + total);

        if (total > 100) {
            System.out.println("Ganhou brinde!!!");
        }
    }
}
