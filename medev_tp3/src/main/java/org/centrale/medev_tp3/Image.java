/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

/**
 *
 * @author floran
 */
public class Image {
    private int longueur;
    private int largeur;
    private int echelle;
    private int[][] pixels;
    

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getEchelle() {
        return echelle;
    }

    public int[][] getPixels() {
        return pixels;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
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
    
    public void loadechelle(String chaine){
        int ech = Integer.parseInt(chaine);
        this.echelle = ech;
    }
    
    
    
    
    
}
