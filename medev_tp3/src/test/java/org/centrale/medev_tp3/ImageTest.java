/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author beryl
 */
public class ImageTest {
    
    public ImageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLargeur method, of class Image.
     */
    @Ignore
    @Test
    public void testGetLargeur() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "getLargeur");
        Image instance = new Image(50,50,180);
        assertTrue(instance.getLargeur() == 50);
        assertFalse(instance.getLargeur() < 50);
        Image autre = new Image();
        assertFalse(autre.getLargeur() == 50);
    }

    /**
     * Test of getEchelle method, of class Image.
     */
    @Ignore
    @Test
    public void testGetEchelle() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "getEchelle");
        Image instance = new Image(50,50,180);
        assertTrue(instance.getEchelle() == 180);
        assertFalse(instance.getEchelle() < 180);
        Image autre = new Image();
        assertFalse(autre.getEchelle() == 180);
    }

    /**
     * Test of getPixels method, of class Image.
     * // problème sur les tableaux de tableaux...
     */
    @Test
    public void testGetPixels() throws FileNotFoundException {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "getPixels");
        ChargementImage instance = new ChargementImage("../test.pgm");
        Image expResult = new Image(10,10,255);
        // Deux cas
        int[][] tab = new int[10][10];
        for (int i=0; i < 10; i++) Arrays.fill(tab[i], 150);
        int i = 0;
        while (i<10) {
            tab[i][i] = 255;
            ++i;
        }
        int[][] tab_test = new int[10][10];
        for (int k=0; k < 10; k++) Arrays.fill(tab_test[k], 130);
        int j = 0;
        while (j<10) {
            tab[j][j] = 10;
            ++j;
        }
        
        int[][] tab_null = new int[10][10];
        expResult.setPixels(tab);
        
        assertTrue(Arrays.equals(expResult.getPixels(), tab));
        assertFalse(Arrays.equals(expResult.getPixels(), tab_test));
        assertFalse(Arrays.equals(expResult.getPixels(), tab_null));

    }


    /**
     * Test of getHauteur method, of class Image.
     */
    @Ignore
    @Test
    public void testGetHauteur() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "getHauteur");
        Image instance = new Image(50,50,180);
        assertTrue(instance.getHauteur() == 50);
        assertFalse(instance.getHauteur() < 50);
        Image autre = new Image();
        assertFalse(autre.getHauteur() == 50);
    }


    /**
     * Test of setPixels method, of class Image.
     */
    @Test
    public void testSetPixels() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "setPixels");
        // Generating a array of pixel and changing it + testing if it is the one we expected

    }

    /**
     * Test of loadSize method, of class Image.
     */
    @Test
    public void testLoadSize() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "loadSize");
        Image instance = new Image();
        String ligne_valide = "120  120";
        instance.loadSize(ligne_valide);
        
    }

    /**
     * Test of loadEchelle method, of class Image.
     */
    @Test
    public void testLoadEchelle() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "loadEchelle");
    }

    /**
     * Test of getPixel method, of class Image.
     */
    @Ignore
    @Test
    public void testGetPixel() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "getPixel");

    }

    /**
     * Test of setPixel method, of class Image.
     */
    @Test
    public void testSetPixel() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "setPixel");

    }

    /**
     * Test of duplicate method, of class Image.
     */
    @Test
    public void testDuplicate() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "duplicate");

    }

    /**
     * Test of seuillage method, of class Image.
     */
    @Test
    public void testSeuillage() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "seuillage");
        
    }

    /**
     * Test of memeFormat method, of class Image.
     * NE FONCTIONNE PAS !!
     */
    @Test
    public void testMemeFormat() throws FileNotFoundException, IOException {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "memeFormat");
        Image expResult = new Image(10,10,255);
        // Deux cas
        int[][] tab = new int[10][10];
        for (int i=0; i < 10; i++) Arrays.fill(tab[i], 150);
        expResult.setPixels(tab);
        
        ChargementImage instance = new ChargementImage("../test.pgm");;
        expResult.setPixels(tab);
        Image result = instance.chargerImage();
        Image result_false = new Image();
        assertTrue(expResult.memeFormat(result));
        assertFalse(expResult.memeFormat(result_false));
        
    }

    /**
     * Test of difference method, of class Image.
     */

    @Test
    public void testDifference() throws Exception {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "difference");
        ChargementImage instance = new ChargementImage("../test.pgm");
        ChargementImage instance_test = new ChargementImage("../baboon.pgm");
        Image result = instance.chargerImage();
        Image result_test = instance_test.chargerImage();
        
    }

    /**
     * Test of changerTaille method, of class Image.
     */
    @Test
    public void testChangerTaille() {
        Logger logger = Logger.getLogger("logger"); 
        logger.log(Level.INFO, "changerTaille");
    }
    
}
