package utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/**
 *
 * @author Alejandro Ureña Marín
 */
public class ListenerBotonDosPosiciones {

    public ListenerBotonDosPosiciones(JToggleButton boton, String archivo1, String archivo2, String archivo3, String archivo4, String texto) {
        
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if(boton.isSelected()){
                    ponerIcono(archivo3, boton);
                }else{
                    ponerIcono(archivo1, boton);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(boton.isSelected()){
                    ponerIcono(archivo4, boton);
                }else{
                    ponerIcono(archivo2, boton);
                }
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                if(boton.isSelected()){
                    ponerIcono(archivo3, boton);
                }else{
                    ponerIcono(archivo1, boton);
                }
            }  
	});
        
        boton.setToolTipText(texto);
    }
    
    public void ponerIcono(String archivo, JToggleButton boton){
        try{  
            boton.setIcon(new ImageIcon(getClass().getResource("/botones/"+archivo)));        
        }
        catch(NullPointerException e){System.out.println("Error"+e);} 
    }
    
}
