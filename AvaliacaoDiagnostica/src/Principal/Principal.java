/*
Crie uma aplicação que permite ao usuário criar forma bidimensionais e tridimensionais. 
Ao acessar a aplicação o usuário poderá criar uma forma (por exemplo um círculo, um quadrado, 
um cubo, um cilindro, etc) e obter algumas informações para a forma criada, 
por exemplo a área, o perímetro, o volume, etc.
Observações importantes:
● Não é necessário que sua aplicação faça conexão com alguma banco de dados;
● Não é obrigatório a criação de uma interface gráfica para o usuário.
● Na classe principal, coloque o nome e o prontuário dos desenvolvedores da
aplicação.

 */
package Principal;

import javax.swing.JOptionPane;

/**
 * @author ht3000966
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        // TODO code application logic here
        int opcao;
              
              opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das formas abaixo: \n"
                + "1 - Para uma forma bidimensional \n"
                + "2 - Para uma form tridimensional \n"));
   
        if (opcao == 1) {
            bidimensional();            
        }
        if (opcao == 2) {
            tridimensional();
        } /*else {
            JOptionPane.showMessageDialog(frame,"Opcao invalida!");
        }    */
        
    }
    
    //Menu para o usuario escolher a forma dimensional 
    public static void bidimensional() {        
        int x;        
        int escolha = 0;
        
        Circulo circulo = new Circulo();
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma forma \n"
                + "1 - Círculo \n "
                + "2 - Quardrado \n "));              

        switch (escolha) {            
           
            case 1:
                circulo.solicitainformacoes();
                break;
           /* case 2:

            case 3:

            case 4:*/
                  
        }
    
    }
   
        
//Menu para o usuario escolher uma forma tridimensional 
     public static void tridimensional() {        
        int x;
       
        x = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma forma \n:"
                + "1 - Cubo \n "
                + "2 - Paralelepido \n "));
               

        /*switch (escolha){
            
            case 0:
                
            case 1:
                
            case 2:
                
            case 3:*/
        }
    }