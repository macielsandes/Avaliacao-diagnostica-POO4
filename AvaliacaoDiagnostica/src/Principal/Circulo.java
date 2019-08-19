/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author ht3000966
 */
public class Circulo {
        
        //variavel principais
        private double area, tamanhoRaio; //
        private double raio;
        private final double PI = Math.PI;
        
        //Calcula a Area
     public double calcularArea(){
            area = PI *(raio * raio);
            return area;            
        }
        
    public void solicitainformacoes() {
        tamanhoRaio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio:"));
            calcularArea();      
            
    }

    
    
    }
    

