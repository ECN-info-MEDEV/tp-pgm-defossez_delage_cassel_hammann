/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

import java.util.Arrays;
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
    
    /**
     * Constructeur par défaut 
     */
    public Image() {
    }
    
    /**
     * Constructeur d'image noire
     * @param largeur Largeur
     * @param hauteur Hauteur
     * @param echelle Valeur max
     */
    public Image(int largeur, int hauteur, int echelle) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.echelle = echelle;
        pixels = new int[largeur][hauteur];
        for (int i=0; i < largeur; i++) Arrays.fill(pixels[i], 0);
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
        for (int i=0; i < largeur; i++) Arrays.fill(pixels[i], 0);
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
    
    /**
     * Dupliquer une image
     * @return Une nouvelle image
     */
    public Image duplicate() {
        Image im = new Image();
        im.setLargeur(largeur);
        im.setHauteur(hauteur);
        im.setEchelle(echelle);
        im.setPixels(pixels);
        return im;
    }
    
    /**
     * Appliquer un seuil sur la photo :
     * si en dessous du seuil, définir à noir, sinon à blanc
     * @param seuil La valeur du seuil
     */
    public void seuillage(int seuil) {
        for (int x=0; x < largeur; x++) {
            for (int y=0; y < hauteur; y++) {
                if (pixels[x][y] < seuil) {
                    pixels[x][y] = 0;
                } else {
                    pixels[x][y] = echelle;
                }
            }
        }
    }
    
    /**
     * Vérifie si deux images sont du même format
     * @param im Une image à comparer
     * @return Vrai si même format
     */
    public boolean memeFormat(Image im) {
        return largeur == im.getLargeur() && 
                hauteur == im.getHauteur() &&
                echelle == im.getEchelle();
    }
    
    /**
     * Calcule l'image des différenes entre deux images
     * @param im Une autre image à comparer
     * @return Une nouvelle image
     * @throws java.lang.Exception Renvoie une erreur si formats différents
     */
    public Image difference(Image im) throws Exception {
        if (!this.memeFormat(im)) {
            throw new Exception("Format différent !");
        } else {
            Image res = new Image(largeur, hauteur, echelle);
            for (int x=0; x<largeur; x++) {
                for (int y=0; y<hauteur; y++) {
                    if (pixels[x][y] == im.getPixel(x, y)) {
                        res.setPixel(x, y, 0);
                    } else {
                        res.setPixel(x, y, echelle);
                    }
                }
            }
            return res;
        }
    }
    
    /**
     * Modifier la taille de l'image
     * @param nLargeur Nouvelle largeur
     * @param nHauteur Nouvelle hauteur
     */
    public void changerTaille(int nLargeur, int nHauteur) {
        int[][] nPixels = new int[nLargeur][nHauteur];
        for (int x=0; x<nLargeur; x++) {
            for (int y=0; y<nHauteur; y++) {
                nPixels[x][y] = this.pixels[(int) x*nLargeur/largeur][(int) y*nHauteur/hauteur];
            }
        }
        pixels = nPixels;
        hauteur = nHauteur;
        largeur = nLargeur;
    }
}
