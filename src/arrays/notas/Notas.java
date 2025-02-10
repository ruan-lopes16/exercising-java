package arrays.notas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner notaAluno = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Insira nota do Aluno: ");
        for (int i = 0; i < 5 ; i++) {

            System.out.print("Nota " + (i + 1) + " = " );
            double nota = notaAluno.nextDouble();
            notas.add(nota);
        }

        System.out.println("Notas inseridas: " + notas);
        notaAluno.close();
    }
}
