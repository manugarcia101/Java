/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductormp3;

import GUI.interfaz;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Ureña Marín
 */
public class ReproductorMP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //reproductor reproductor = new reproductor();
        
        //reproductor.setVisible(true);
        
        interfaz programa = new interfaz();
        programa.setVisible(true);
    }
    
}
