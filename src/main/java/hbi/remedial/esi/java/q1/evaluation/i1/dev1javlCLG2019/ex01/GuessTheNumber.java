package hbi.remedial.esi.java.q1.evaluation.i1.dev1javlCLG2019.ex01;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre compris entre 1 et 100 !");
        int proposedNumber = scanner.nextInt();

        int randomValue = ((int) (Math.random() * (100 - 1))) + 1;

        if (proposedNumber < 1 || proposedNumber > 100) {
            System.out.println("ce " + proposedNumber + "n'est pas compris entre 1 et 100");
        } else if (proposedNumber == randomValue) {
            System.out.println("vous avez gagné !");
        } else {
            System.out.println("vous avez perdu essayer un autre nombre ");
        }
    }
}
