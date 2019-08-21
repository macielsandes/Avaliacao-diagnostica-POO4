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
public class Cubo {
    
    private double lado1, lado2, lado3, area;
    
    //Este metodo irá calcular a Area do quadrado
    public double calcularCubo(double lado1, double lado2, double lado3){
        area = lado1 * lado2 * lado3;
        return area;       
    }
    
}
