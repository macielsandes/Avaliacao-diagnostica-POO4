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
public class Piramide extends Tridimensional {
    private double base, altura, volume, perimetro;
            
    @Override
    public double CalcularVolume() {
         volume = ((base * base ) * altura)/ 3;
         return volume;
    }

    @Override
    public double calcularPerimetro() {
       perimetro = base + base /2;
       return perimetro;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

     

    
}
