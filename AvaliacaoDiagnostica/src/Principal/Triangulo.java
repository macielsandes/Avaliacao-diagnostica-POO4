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
public class Triangulo {
    
    private double base;
    private double altura;
    private double area;
    
    //pedir para o usuario informar a base e a altura do triangulo para ser ter a AREA
    //Este metodo irá calcular a Area do triangulo
    public double calcularTriangulo(double base, double altura){
        area = ((base * altura) / 2);
        return area;       
    }
    
    
}
