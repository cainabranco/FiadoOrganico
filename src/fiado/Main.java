package fiado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor();
        consumidor.fiados = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do cliente: ");
        consumidor.nome = scanner.nextLine();
        System.out.print("Informe o valor da compra: ");
        consumidor.fiados[0] = Integer.valueOf(scanner.nextLine());

        int total = somaForEach(consumidor.fiados);

        System.out.println("Cliente " + consumidor.nome + " deve: " + total);

        if (total > 100) {
            System.out.println("Ganhou brinde!!!");
        }
    }



    public static int somaWhile(int[] fiados) {

        int total = 0;
        int i = 0;
        while (i < fiados.length) {
            total += fiados[i];
            i++;
        }

        return total;
    }

    public static int somaFor (int[] fiados) {

        int total = 0;
        for (int i = 0; i < fiados.length; i++) {
            total += fiados[i];
        }

        return total;
    }

    public static int somaForEach (int[] fiados) {

        int total = 0;
        for (int fiado : fiados) {
            total += fiado;
        }

        return total;
    }
}
