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
    
    private double lado, area, perimetro;
    
    //Este metodo irá calcular a Area do quadrado
    public double calcularArea(){
        area = lado * lado;
        return area;       
    }
    
    //Este metodo irá calcular o Pèrimeto
   public double calcularPerimetro(){
        perimetro = 4 * lado;
        return perimetro;
    }
    
    //imprime
    /*void imprimir(){
        JOptionPane.showMessageDialog("O quadrado de lado: ",lado );
    }*/
    
    
}