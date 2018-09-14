package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        Personnage tableaupersonnages[] = new Personnage[12];
        NainJardin tableaunains[] = new NainJardin[8];
        for (int i = 0; i < tableaupersonnages.length; i++) {
            if (i < 4) {
                tableaupersonnages[i] = new Monstre(r.nextInt(100), "Monstre #" + i);
                tableaunains[i] = new NainJardin(r.nextInt(100), "Nain #" + i);

            } else if (i < 8) {
                tableaupersonnages[i] = new Sorcier(r.nextInt(100), "Sorcier #" + (i - 4));
                tableaunains[i] = new GnomeJardin(r.nextInt(100), "Gnome #" + (i - 4));
            } else  {
                tableaupersonnages[i] = new Magicien(r.nextInt(100), "Mage #" + (i - 8));



            }
        }

            System.out.println("");

            for (int j = 1; j < 11; j++) {
                System.out.println("\nRound " + j);

                int attaquant = r.nextInt(12);
                int defenseur = r.nextInt(20);
                while(attaquant == defenseur){
                    attaquant = r.nextInt(12);
                    defenseur = r.nextInt(20);
                }


                if (defenseur >= 12) {
                    defenseur = defenseur%12;
                    tableaupersonnages[attaquant].attaque(tableaunains[(defenseur )]);
                    System.out.println(tableaupersonnages[attaquant]);
                    System.out.println(tableaunains[defenseur]);
                } else {
                    tableaupersonnages[attaquant].attaque(tableaupersonnages[defenseur]);
                    System.out.println(tableaupersonnages[attaquant]);
                    System.out.println(tableaupersonnages[defenseur]);
                }




            }
            System.out.println("\nRésultats :\n");
            for (Personnage k : tableaupersonnages) {

                System.out.println(k);

            }
            for (Victime v : tableaunains){
                System.out.println(v);
            }

        }
}
