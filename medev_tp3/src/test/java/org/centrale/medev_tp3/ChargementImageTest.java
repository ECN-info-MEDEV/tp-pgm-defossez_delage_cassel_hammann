/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.medev_tp3;

 

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author beryl
 */
public class ChargementImageTest {
    
    public ChargementImageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of chargerImage method, of class ChargementImage.
     */
    @Ignore
    @Test
    public void testChargerImage() throws Exception {
        Logger logger = Logger.getLogger("logger");
        logger.log(Level.INFO, "ChargerImage");
        ChargementImage instance = new ChargementImage("../test.pgm");
        Image result = instance.chargerImage();
        Image expResult = new Image(10,10,255);
        int[][] tab = new int[10][10];
        for (int i=0; i < 10; i++) Arrays.fill(tab[i], 150);
        assertFalse(expResult.equals(result));
        int i = 0;
        while (i<10) {
            tab[i][i] = 255;
            ++i;
        }
        expResult.setPixels(tab);
        assertTrue(expResult.equals(result));
    }
    
}
