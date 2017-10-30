/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;

import javax.swing.JOptionPane;

/*******************************************************************************
 *Alejandro yavara Vargas
 * 
 * Fecha: octubre  octubre 30 de 2017
 * Programa:NombreEdad
 * Responsabilidad: Clase Principal
 * @author LAB01
 
 ******************************************************************************/
public class NombreEdad {
    
  public static void main(String[] args) 
  {
      String nombre ; int edad;
      nombre = (JOptionPane.showInputDialog("Ingrese su nombre"));
      edad = Integer.parseInt (JOptionPane.showInputDialog("Ingrese su edad"));
      JOptionPane.showMessageDialog(null,"Bienvenido:"+ (nombre));
      JOptionPane.showMessageDialog(null,"En 20 años usted tendra:"+ (edad+20));
      
      
  }
    
    
}
