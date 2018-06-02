package utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alejandro Ureña Marín
 */
public class ListenerBotones {

    public ListenerBotones(JButton boton, String archivo1, String archivo2, String texto) {
        
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ponerIcono(archivo1, boton);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ponerIcono(archivo2, boton);
            }       
	});
        
        boton.setToolTipText(texto);
    }
    
    public void ponerIcono(String archivo, JButton boton){
        try{  
            boton.setIcon(new ImageIcon(getClass().getResource("/botones/"+archivo)));        
        }
        catch(NullPointerException e){System.out.println("Error"+e);} 
    }
    
}
