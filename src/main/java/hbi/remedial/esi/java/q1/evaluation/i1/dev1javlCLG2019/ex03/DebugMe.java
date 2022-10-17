package hbi.remedial.esi.java.q1.evaluation.i1.dev1javlCLG2019.ex03;

import java.util.Scanner;

public class DebugMe {
    public static void main(String[] args) {
        //Scanner sc = new scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier");
        //int nb = keyboard.nextDouble(); deux error ici "keyboard n'existe pas" et on met un double dans un entier
        int nb = sc.nextInt();
        if (nb > 5) {
            System.out.println(nb + "est plus grand  que " + 5);
        } else if (nb < 5) {
            System.out.println(nb + "est plus petit  que " + 5);
        } else {
            //System.out.println(nb "vaut 5 !"); il manque une concatenation
            System.out.println(nb + "vaut 5 !");
        }
    }
}
