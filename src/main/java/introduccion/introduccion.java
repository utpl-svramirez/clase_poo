/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

import javax.swing.JOptionPane;

/**
 *Este ejercicio es como crear datos de entrada y salida con JOptionPane
 * el cual sirve para que se muestre el código en una pop up box nueva
 * 
 * @author spsmh 
 */
public class introduccion {
    
 public static void main (String[] args) {
        String cadena;
        int cifra;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        cifra = Integer.parseInt(JOptionPane.showInputDialog("Digite una cifra: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "La cifra es: "+cifra);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
       
        
    }
   
}
