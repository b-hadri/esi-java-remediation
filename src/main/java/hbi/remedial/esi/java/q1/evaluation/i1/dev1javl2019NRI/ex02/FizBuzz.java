package hbi.remedial.esi.java.q1.evaluation.i1.dev1javl2019NRI.ex02;

import java.util.Scanner;

public class FizBuzz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez le nombre : ");
        int number = keyboard.nextInt();

        //Un nombre est divisible par 15  s'il est divisible à la fois par  3 et par 5.
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fiz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Autre");
        }
    }
}
