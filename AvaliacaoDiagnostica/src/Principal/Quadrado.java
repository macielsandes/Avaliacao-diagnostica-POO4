/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author maciel
 */
public class Quadrado extends Bidimensional {
    
    private double lado1, lado2, area, perimetro;
     
    @Override
    public double calcularArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        area = lado1 * lado2;
        return area;   
    }

    @Override
    public double perimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        perimetro = 4 * lado1 * lado2;
        return perimetro;
    }    
    
}
