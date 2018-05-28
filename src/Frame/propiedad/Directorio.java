/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame.propiedad;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author CARLOS
 */
public class Directorio {
    public static String login = "src/Frame/imagenes/seguridad/login.png";
    public static String fondoLogin = "src/Frame/imagenes/seguridad/fondoLogin.jpg";
    public static String botonAtras = "src/Frame/imagenes/iconos/retroceso.png";
    public static String botonSalir = "src/Frame/imagenes/iconos/salir.png";
    
    public static void ponerImagenLabel(JLabel label, String ruta){
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono); 
    }
    
    public static void ponerImagenBoton(JButton boton, String ruta){
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icono); 
    }
}
