package hbi.remedial.esi.java.q1.evaluation.i1.dev1javlCLG2019.ex02;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre à trois chiffres");
        int number = scanner.nextInt();
        if (number < 100) {
            System.out.println("c'est pas un nombre à 3 chiffres");
            // gestion des exception on verra plus tard
        } else {
            int hundred = number / 100;
            int decade = (number % 100) / 10;
            int unit = decade % 100;

            if (hundred % 2 != 0 && decade % 5 != 0 && unit % 3 == 0) {
                System.out.println("c’est gagné!");
            } else {
                int somme = hundred  + unit;
                System.out.println("la somme est égal = " + somme);
            }
        }
    }

}
