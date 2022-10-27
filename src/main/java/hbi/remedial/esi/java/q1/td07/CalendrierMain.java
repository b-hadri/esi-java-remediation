package hbi.remedial.esi.java.q1.td07;

public class CalendrierMain {

    public static void main(String[] args) {

        int mois = 10;
        int année = 2022;

        System.out.println(titreMois(mois, année));
        System.out.println(getAffichageMois(1, 28));

    }


    public static String nomMois(int numéroMois) {
        String nomMois = "undefined";
        switch (numéroMois) {
            case 1:
                nomMois = "Janvier";
                break;
            case 2:
                nomMois = "Février";
                break;
            case 3:
                nomMois = "Mars";
                break;
            case 4:
                nomMois = "Avril";
                break;
            case 5:
                nomMois = "Mai";
                break;
            case 6:
                nomMois = "Juin";
                break;
            case 7:
                nomMois = "Juillet";
                break;
            case 8:
                nomMois = "Aout";
                break;
            case 9:
                nomMois = "Septembre";
                break;
            case 10:
                nomMois = "Octobre";
                break;
            case 11:
                nomMois = "Novembre";
                break;
            case 12:
                nomMois = "Décembre";
                break;
        }
        return nomMois;
    }

    public static String titreMois(int numéroMois, int année) {
        return "==========================\n" +
                nomMois(numéroMois) + " " + année + "\n" +
                "==========================";

    }

    public static String getAffichageMois(int décalage, int nombreDeJours) {
        String affichage = "";
        int indice = 1;

        while (indice <= (décalage + nombreDeJours)) {
            if (indice <= décalage) {
                affichage += " \t";
            } else {
                affichage += indice - décalage + "\t";
                if ((indice % 7) == 0) {
                    affichage += "\n";
                }
            }
            indice++;
        }

        return affichage;
    }

    public static boolean estBissextile(int annee) {
        return ((annee % 4) == 0 && (annee % 100) != 0) || (annee % 400) == 0;
    }

    public static int nombreJours(int numéroMois, int année) {
        int nombre = 31; // default
        switch (numéroMois) {
            case 2:
                nombre = (estBissextile(année)) ? 29 : 28;
                break;
            case 4:
                nombre = 30;
                break;
            case 6:
                nombre = 30;
                break;
            case 8:
                nombre = 30;
                break;
            case 10:
                nombre = 30;
                break;
            case 12:
                nombre = 30;
                break;
        }
        return nombre;
    }

    public static int nombreDeDecalageDe(int numberDuMois, int année) {
        return congruenceDeZellerDe(1, numberDuMois, année);
    }

    private static int congruenceDeZellerDe(int numéroDuJour, int numberDuMois, int année) {
        // TODO: congruence
//        int congruence = ...

        return 0;
    }
}
