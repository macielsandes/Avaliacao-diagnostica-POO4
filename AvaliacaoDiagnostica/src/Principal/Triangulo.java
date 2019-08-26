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
public class Triangulo extends Bidimensional{
    
    //principais variaveis
    private double base;
    private double altura;
    private double area;
    private double perimetro;
    private double lado;
    
    //pedir para o usuario informar a base e a altura do triangulo para ser ter a AREA
    //Este metodo irá calcular a Area do triangulo
   /* public double calcularTriangulo(double base, double altura){
        area = ((base * altura) / 2);
        return area;   */    
    //}

    @Override
    public double calcularArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        area = ((getBase() * getAltura()) / 2);
        return area;
    }

  
    @Override
    public double CalcularPerimetro() {
        perimetro = (3 * lado);
        return perimetro;
        
        
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
