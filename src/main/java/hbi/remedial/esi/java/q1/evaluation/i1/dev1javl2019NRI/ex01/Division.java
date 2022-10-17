package hbi.remedial.esi.java.q1.evaluation.i1.dev1javl2019NRI.ex01;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez le numérateur : ");
        double numerator = keyboard.nextDouble();
        System.out.println("Entrez le dénomateur : ");
        double denomerator = keyboard.nextDouble();

        if (denomerator == 0) {
            System.out.println("Attention, division par zéro !");
        } else {
            double result = numerator / denomerator;
            System.out.println(result);
        }
    }
}
