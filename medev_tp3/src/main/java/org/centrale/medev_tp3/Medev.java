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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ChargementImage chargement = new ChargementImage("../baboon.pgm");
        Image im;
        im = chargement.chargerImage();
        
    }
    
}
