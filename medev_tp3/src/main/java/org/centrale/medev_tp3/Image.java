/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

import java.util.StringTokenizer;

/**
 * Classe représentant une image
 * @author floran
 */
public class Image {
    /**
     * Largeur d'une image
     */
    private int largeur;
    /**
     * Hauteur d'une image
     */
    private int hauteur;
    /**
     * Valeur maximale d'un pixel de l'image
     */
    private int echelle;
    /**
     * Tableau des valeurs des pixels
     */
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
    
    /**
     * Charger la valeur de largeur et hauteur à partir d'une ligne de texte
     * @param ligne un string avec les deux valeurs de hauteur et largeur
     */
    public void loadSize(String ligne) {
        StringTokenizer tokenizer = new StringTokenizer(ligne, " ");
        String sLargeur = tokenizer.nextToken();
        largeur = Integer.parseInt(sLargeur);
        String sHauteur = tokenizer.nextToken();
        hauteur = Integer.parseInt(sHauteur);
        pixels = new int[largeur][hauteur];
    }
    
    /**
     * Charger la valeur de Echelle à partir d'une ligne de texte
     * @param chaine un string avec la valeur max
     */
    public void loadEchelle(String chaine){
        int ech = Integer.parseInt(chaine);
        this.echelle = ech;
    }
    
    /**
     * Rechercher la valeur d'un pixel
     * @param x Abscisse
     * @param y Ordonnée
     * @return Valeur du pixel
     */
    public int getPixel(int x, int y) {
        return pixels[x][y];
    }
    
    /**
     * Attribuer une valeur à un pixel
     * @param x Abscisse
     * @param y Ordonnée
     * @param val Valeur à définir
     */
    public void setPixel(int x, int y, int val) {
        pixels[x][y] = val;
    }
    
}
