package arrays.parImpar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenaParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Insira a quantidade de números que serão inseridos: ");
        // numero de entradas que serão inseridas
        int numEntradas = entrada.nextInt();

        // criando lista de pares e impares
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Insira os números!");
        // laço for para iteração
        for (int i = 0; i < numEntradas; i++) {
            int num = entrada.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        // ordena pares em ordem crescente
        Collections.sort(pares);

        // ordena impares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("PARES");
        // imprime os pares ordenados
        for (int par: pares) {
            System.out.println(par);
        }

        System.out.println("ÍMPARES");
        // imprime impares ordenados
        for (int impar: impares) {
            System.out.println(impar);
        }

        // fechando entrada
        entrada.close();

    }
}
