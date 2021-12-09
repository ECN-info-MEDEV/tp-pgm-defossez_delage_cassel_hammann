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
    @Test
    public void testChargerImage() throws Exception {
        System.out.println("chargerImage");
        ChargementImage instance = null;
        Image expResult = null;
        Image result = instance.chargerImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
