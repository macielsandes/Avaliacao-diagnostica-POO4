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

//Este metodo efetua o calculo de uma forma bidimensional
public class Quadrado extends Bidimensional {
    
//principais variveis
    private double lado, area, perimetro;

    @Override
    public double calcularArea() {
        area = getLado() * getLado();
        return area;
    }

    @Override
    public double CalcularPerimetro() {
        perimetro = 4 * getLado() * getLado();
        return perimetro;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

}
