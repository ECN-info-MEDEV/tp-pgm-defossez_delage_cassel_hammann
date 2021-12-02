package org.centrale.medev_tp3;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author floran
 */
public class EcritureImage {
    public BufferedWriter bufferedWriter;
    public String filename;
    
    public EcritureImage(String filename) {
        this.filename = filename;
    }
    
    public void ecrireImage(Image im) throws IOException {
        bufferedWriter = new BufferedWriter(new FileWriter(filename));
        bufferedWriter.write("P2");
        bufferedWriter.newLine();
        bufferedWriter.write("#");
        bufferedWriter.newLine();
        bufferedWriter.write( im.getLargeur() + " " + im.getHauteur());
        bufferedWriter.newLine();
        bufferedWriter.write("255");
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
}
