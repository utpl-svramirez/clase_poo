
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author spsmh
 */
public class NewClass {
    
 public static void main (String[] args) {
        String juego;
        int score;
        String nombre;

        
        juego = JOptionPane.showInputDialog("Ingrese el nombre de su juego (Pacman o NSF): ");
        score = Integer.parseInt(JOptionPane.showInputDialog("Digite el puntaje obtenido: "));
        nombre = JOptionPane.showInputDialog("Digite el nombre del jugador: ");

        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "La cifra es: "+cifra);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);

       
        
    }
   
}    
}
