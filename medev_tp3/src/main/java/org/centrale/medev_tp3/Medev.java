/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author floran
 */
public class Medev {
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        ChargementImage chargement = new ChargementImage("../baboon.pgm");
        Image im = chargement.chargerImage();
        Image im_seuil = im.duplicate();
        im_seuil.seuillage(127);
        im_seuil.save("../baboon_seuil.pgm");
        im.save("../baboon_copy.pgm");
        Image im_diff = im.duplicate();
        im_diff.difference(im_seuil);
        im_diff.save("../baboon_diff.pgm");
        Image im_little = im.duplicate();
        im_little.changerTaille(100, 100);
        im_little.save("../baboon_little.pgm");
        Image im_big = im.duplicate();
        im_big.changerTaille(500,500);
        im_big.save("../baboon_big.pgm");
    }
    
}
