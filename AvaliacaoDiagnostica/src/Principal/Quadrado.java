/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author macie
 */
public class Quadrado {
    
    private double lado1, lado2, area, perimetro;
    
    //Este metodo irá calcular a Area do quadrado
    public double calcularArea(double lado1, double lado2){
        area = lado1 * lado2;
        return area;       
    }
    
    //Este metodo irá calcular o Pèrimeto
   public double calcularPerimetro(){
        perimetro = 4 * lado1 * lado2;
        return perimetro;
    }
    
   /*void construtor(){
      double entrada;      
      entrada = Double.parseDouble((JOptionPane.showInputDialog("Informe do "
              + "valor do lado do quadrado"));
      lado = entrada
        //lado = entrada.nextDouble();*/
    //}
    
    
}
