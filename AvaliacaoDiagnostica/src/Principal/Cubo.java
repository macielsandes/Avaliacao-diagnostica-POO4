/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static java.lang.Math.pow;

/**
 *
 * @author macie
 */
public class Cubo extends Tridimensional {

    private double volume, perimetro, aresta;

    //Este metodo irá calcular a area
    @Override
    public double calcularPerimetro() {
        perimetro = (4 * pow (aresta, 2));
        return perimetro;
    }

    //Este metodo irá calcular o perimetro 
    @Override
    public double CalcularVolume() {
       volume = pow (aresta,3);
        return volume;
    }

    /**
     * @param aresta the aresta to set
     */
    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

  

  

  
}
