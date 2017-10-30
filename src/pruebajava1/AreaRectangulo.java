/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;
import java.util.Scanner;
/******************************************************************************
 *Alejandro yavara Vargas
 * 
 * Fecha: octubre  octubre 30 de 2017
 * Programa:AreaRectangulo
 * Responsabilidad: Clase Principal
 * @author LAB01
 ******************************************************************************/
public class AreaRectangulo 
{
 public static void main(String[] args)
 {
  int area;
  
  Scanner escaner=new Scanner(System.in);
System.out.println("Ingrese la base del rectangulo:");
int base = escaner.nextInt();

System.out.println("Ingrese altura del rectangulo:");
int altura = escaner.nextInt();
area=base*altura;
System.out.println("El area  del rectangulo es:"+area+" mts2");






  

  

     
 } 
         
}
