/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author flora
 */
public class ChargementImage {
    //attribut
    public String source;
    public BufferedReader fichier;
    public static final String delimiteurs = "  ";
    StringTokenizer tokenizer;

    //constructeur
    public ChargementImage(String nom) throws FileNotFoundException{
       this.source=nom;
       fichier = new BufferedReader(new FileReader(source));
    }
    
    public Image chargerImage() throws IOException {
       String ligne;
       Image im = new Image();
       fichier.readLine();
       fichier.readLine();
       im.loadSize(fichier.readLine());
       im.loadEchelle(fichier.readLine());
       ligne = fichier.readLine();
       int x = 0;
       int y = 0;
       String mot;
       while (ligne != null) {
           tokenizer = new StringTokenizer(ligne,ChargementImage.delimiteurs);
           while(tokenizer.hasMoreTokens()) {
                mot = tokenizer.nextToken();
                if (x == im.getLargeur()) {
                    x = 0;
                    y = y + 1;
                }
                im.setPixel(x, y, Integer.parseInt(mot));
                x = x + 1; 
            }
           ligne = fichier.readLine();
       }
       fichier.close();
       return im;
    }
   
   
}
