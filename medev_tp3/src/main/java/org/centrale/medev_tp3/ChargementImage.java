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

/**
 *
 * @author flora
 */
public class ChargementImage {
    //attribut
    public String source;
    public BufferedReader fichier;


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
       while (ligne != null) {
           im.addPixel(x, y, val);
           ligne = fichier.readLine();
       }
       fichier.close();
       return i;
    }
   
   
}
