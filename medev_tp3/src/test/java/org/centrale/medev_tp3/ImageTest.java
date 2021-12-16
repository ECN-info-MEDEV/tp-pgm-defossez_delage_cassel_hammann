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
        Image instance = new Image(50,50,180);
        assertTrue(instance.getLargeur() == 50);
        assertFalse(instance.getLargeur() < 50);
        Image autre = new Image();
        assertFalse(autre.getLargeur() == 50);
    }

    /**
     * Test of getEchelle method, of class Image.
     */
    @Test
    public void testGetEchelle() {
        System.out.println("getEchelle");
        Image instance = new Image(50,50,180);
        assertTrue(instance.getEchelle() == 180);
        assertFalse(instance.getEchelle() < 180);
        Image autre = new Image();
        assertFalse(autre.getEchelle() == 180);
    }

    /**
     * Test of getPixels method, of class Image.
     */
    @Test
    public void testGetPixels() {
        System.out.println("getPixels");
        Image instance = new Image(50,50,180);
        assertTrue(instance.getPixels().equals(new int[50][50]));
    }


    /**
     * Test of getHauteur method, of class Image.
     */
    @Test
    public void testGetHauteur() {
        System.out.println("getHauteur");
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
        System.out.println("setPixels");
        // Générating a array of pixel and changing it + testing if it is the one we expected

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
