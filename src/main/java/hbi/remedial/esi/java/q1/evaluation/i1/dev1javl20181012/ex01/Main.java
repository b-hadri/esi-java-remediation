package hbi.remedial.esi.java.q1.evaluation.i1.dev1javl20181012.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int rayon = 1;

        System.out.print("Entrer un entier: ");
        int rayonMax = clavier.nextInt();

        while (rayon <= rayonMax) {
            double volume = (4d / 3d) * Math.PI * Math.pow(rayon, 3);
            String message = String.format("Le rayon %3d | Volume %10.2f", rayon, volume);
            System.out.println(message);
            rayon++;
        }

    }

}
