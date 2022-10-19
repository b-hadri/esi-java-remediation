package hbi.remedial.esi.java.q1.evaluation.i1.dev1javl2019NRI.ex03;

import java.util.Scanner;

public class DebugMe {
    public static void main(String[] args) {
        // Scanner clavier = new Scanner(System.in);
        // if ((clavier.nextInt() % 2) = 0) {
        //     System.out.println(ce nombre est pair)
        // } else {
        //     System.out.println(ce nombre est impair);
        //  }
        Scanner clavier = new Scanner(System.in);
        // 1. manque ==
        if ((clavier.nextInt() % 2) == 0) {
            System.out.println("ce nombre est pair");
            //1.manque ;
            //2. manque ""
        } else {
            System.out.println("ce nombre est impair");
            //1. manque ""
        }
    }
}
