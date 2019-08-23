/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author ht3000966
 */

public class Circulo extends Bidimensional{        
        
        //variavel principais
        private double perimetro;
        private double area;
        private double raio;
        private final double PI = Math.PI;
        
    //Calcula a Area
    @Override
    public double calcularArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        area = PI *(raio * raio);
            return area;       
    }
    
    //Calcular Perimetro
    @Override
    public double perimetro() {
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        perimetro = ((2 * PI) * raio);
        return perimetro;
    }
                  
    }

   
    

