package org.centrale.medev_tp3;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author floran
 */
public class EcritureImage {
    private BufferedWriter fichier;
    private final String filename;
    private static final String DELIMITEUR = "  ";
    private static final int LONGUEUR_MAX = 70;
    
    public EcritureImage(String filename) {
        this.filename = filename;
    }
    
    public void ecrireImage(Image im) throws IOException {
        fichier = new BufferedWriter(new FileWriter(filename));
        fichier.write("P2");
        fichier.newLine();
        fichier.write("#");
        fichier.newLine();
        fichier.write(im.getLargeur() + "  " + im.getHauteur());
        fichier.newLine();
        fichier.write(im.getEchelle());
        for (int x=0; x < im.getLargeur(); x++) {
            int longueurLigne = 0;
            for (int y=0; y < im.getHauteur(); y++) {
                int val = im.getPixel(x, y);
                String chaine = val + DELIMITEUR;
                longueurLigne += chaine.length();
                if (longueurLigne > LONGUEUR_MAX) fichier.newLine();
                fichier.write(chaine);
            }
            fichier.newLine();
        }
        fichier.close();
    }
    
}
