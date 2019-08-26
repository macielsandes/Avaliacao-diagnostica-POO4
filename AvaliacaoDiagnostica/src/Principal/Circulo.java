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
        area = PI *(raio* raio);
            return area;       
    }
    
    //Calcular Perimetro
   
     @Override
    public double CalcularPerimetro() {
        perimetro = ((2 * PI) * getRaio());
        return perimetro;
    }   
    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }   
        
    
    }

   
    

