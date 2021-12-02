/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

import java.util.StringTokenizer;

/**
 *
 * @author floran
 */
public class Image {
    private int largeur;
    private int hauteur;
    private int echelle;
    private int[][] pixels;
    

    public int getLargeur() {
        return largeur;
    }

    public int getEchelle() {
        return echelle;
    }

    public int[][] getPixels() {
        return pixels;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setEchelle(int echelle) {
        this.echelle = echelle;
    }

    public void setPixels(int[][] pixels) {
        this.pixels = pixels;
    }
    
    public void loadSize(String ligne) {
        StringTokenizer tokenizer = new StringTokenizer(ligne, " ");
        String sLargeur = tokenizer.nextToken();
        largeur = Integer.parseInt(sLargeur);
        String sHauteur = tokenizer.nextToken();
        hauteur = Integer.parseInt(sHauteur);
        pixels = new int[largeur][hauteur];
    }
    
}
