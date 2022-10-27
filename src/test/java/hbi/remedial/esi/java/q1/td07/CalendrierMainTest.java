package hbi.remedial.esi.java.q1.td07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendrierMainTest {

    @Test
    void nomMois_doitEtreJanvier() {
        assert CalendrierMain.nomMois(1).equals("Janvier");
    }

    @Test
    void nomMois_doitEtreFevrier() {
        assert CalendrierMain.nomMois(2).equals("Février");
    }

    @Test
    void nomMois_doitEtreDécembre() {
        assert CalendrierMain.nomMois(12).equals("Décembre");
    }

    @Test
    void nomMois_doitEtreUndefined() {
        assert CalendrierMain.nomMois(0).equals("undefined");
    }

    @Test
    void titre_doitJuin2018() {
        String titre =
                "==========================\n" +
                "Juin 2018\n" +
                "==========================";

        assert CalendrierMain.titreMois(6, 2018).equals(titre);
    }

    @Test
    void titre_doitJanvier2024() {
        String titre =
                "==========================\n" +
                        "Janvier 2024\n" +
                        "==========================";

        assert CalendrierMain.titreMois(1, 2024).equals(titre);
    }

    @Test
    void affichageMois_decalage1_nbrJours28() {
        String affichageDuMois = " \t1\t2\t3\t4\t5\t6\t\n" +
                "7\t8\t9\t10\t11\t12\t13\t\n" +
                "14\t15\t16\t17\t18\t19\t20\t\n" +
                "21\t22\t23\t24\t25\t26\t27\t\n" +
                "28\t";
        assert CalendrierMain.getAffichageMois(1, 28).equals(affichageDuMois);
    }

    @Test
    void estBissextile_annee2024_doitEtreVraie() {
        int annee = 2024;
        boolean result = true;

        assert CalendrierMain.estBissextile(annee) == result;
    }

    @Test
    void estBissextile_annee2023_doitEtreFausse() {
        int annee = 2023;
        boolean result = false;

        assert CalendrierMain.estBissextile(annee) == result;
    }

    @Test
    void estBissextile_annee1600_doitEtreVraie() {
        int annee = 1600;
        boolean result = true;

        assert CalendrierMain.estBissextile(annee) == result;
    }

    @Test
    void estBissextile_annee2008_doitEtreVraie() {
        int annee = 2008;
        boolean result = true;

        assert CalendrierMain.estBissextile(annee) == result;
    }

    @Test
    void estBissextile_annee2009_doitEtreFausse() {
        int annee = 2009;
        boolean result = false;

        assert CalendrierMain.estBissextile(annee) == result;
    }

    @Test
    void nombreJours_1_2018_doitEtre31() {
        int numéroMois = 1;
        int année = 2018;

        int resultatAttendu = 31;

        assert CalendrierMain.nombreJours(numéroMois, année) == resultatAttendu;
    }

    @Test
    void nombreJours_2_2018_doitEtre28() {
        int numéroMois = 2;
        int année = 2018;

        int resultatAttendu = 28;

        assert CalendrierMain.nombreJours(numéroMois, année) == resultatAttendu;
    }

    @Test
    void decalage_mars2008_decalageEgalA_Zero () {
        int numéroMois = 3;
        int année = 2008;

        int decalageAttendu = 0;

        assert CalendrierMain.nombreDeDecalageDe(numéroMois, année) == decalageAttendu;
    }

    @Test
    void decalage_octobre2022_decalageEgalA_Zero () {
        int numéroMois = 3;
        int année = 2008;

        int decalageAttendu = 5;

        assert CalendrierMain.nombreDeDecalageDe(numéroMois, année) == decalageAttendu;
    }
}