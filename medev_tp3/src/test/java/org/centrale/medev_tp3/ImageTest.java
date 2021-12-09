/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    @Test
    public void testGetLargeur() {
        System.out.println("getLargeur");
        Image instance = new Image();
        int expResult = 0;
        int result = instance.getLargeur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEchelle method, of class Image.
     */
    @Test
    public void testGetEchelle() {
        System.out.println("getEchelle");
        Image instance = new Image();
        int expResult = 0;
        int result = instance.getEchelle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPixels method, of class Image.
     */
    @Test
    public void testGetPixels() {
        System.out.println("getPixels");
        Image instance = new Image();
        int[][] expResult = null;
        int[][] result = instance.getPixels();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHauteur method, of class Image.
     */
    @Test
    public void testSetHauteur() {
        System.out.println("setHauteur");
        int hauteur = 0;
        Image instance = new Image();
        instance.setHauteur(hauteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHauteur method, of class Image.
     */
    @Test
    public void testGetHauteur() {
        System.out.println("getHauteur");
        Image instance = new Image();
        int expResult = 0;
        int result = instance.getHauteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLargeur method, of class Image.
     */
    @Test
    public void testSetLargeur() {
        System.out.println("setLargeur");
        int largeur = 0;
        Image instance = new Image();
        instance.setLargeur(largeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEchelle method, of class Image.
     */
    @Test
    public void testSetEchelle() {
        System.out.println("setEchelle");
        int echelle = 0;
        Image instance = new Image();
        instance.setEchelle(echelle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPixels method, of class Image.
     */
    @Test
    public void testSetPixels() {
        System.out.println("setPixels");
        int[][] pixels = null;
        Image instance = new Image();
        instance.setPixels(pixels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadSize method, of class Image.
     */
    @Test
    public void testLoadSize() {
        System.out.println("loadSize");
        String ligne = "";
        Image instance = new Image();
        instance.loadSize(ligne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadEchelle method, of class Image.
     */
    @Test
    public void testLoadEchelle() {
        System.out.println("loadEchelle");
        String chaine = "";
        Image instance = new Image();
        instance.loadEchelle(chaine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPixel method, of class Image.
     */
    @Test
    public void testGetPixel() {
        System.out.println("getPixel");
        int x = 0;
        int y = 0;
        Image instance = new Image();
        int expResult = 0;
        int result = instance.getPixel(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPixel method, of class Image.
     */
    @Test
    public void testSetPixel() {
        System.out.println("setPixel");
        int x = 0;
        int y = 0;
        int val = 0;
        Image instance = new Image();
        instance.setPixel(x, y, val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of duplicate method, of class Image.
     */
    @Test
    public void testDuplicate() {
        System.out.println("duplicate");
        Image instance = new Image();
        Image expResult = null;
        Image result = instance.duplicate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seuillage method, of class Image.
     */
    @Test
    public void testSeuillage() {
        System.out.println("seuillage");
        int seuil = 0;
        Image instance = new Image();
        instance.seuillage(seuil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of memeFormat method, of class Image.
     */
    @Test
    public void testMemeFormat() {
        System.out.println("memeFormat");
        Image im = null;
        Image instance = new Image();
        boolean expResult = false;
        boolean result = instance.memeFormat(im);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of difference method, of class Image.
     */
    @Test
    public void testDifference() throws Exception {
        System.out.println("difference");
        Image im = null;
        Image instance = new Image();
        Image expResult = null;
        Image result = instance.difference(im);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changerTaille method, of class Image.
     */
    @Test
    public void testChangerTaille() {
        System.out.println("changerTaille");
        int nLargeur = 0;
        int nHauteur = 0;
        Image instance = new Image();
        instance.changerTaille(nLargeur, nHauteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
