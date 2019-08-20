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
        
        int opcao; // variavel para guardar opcao do usario
        
        // Solicitando ao usuario para escolher uma forma
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das formas abaixo: \n"
                + "1 - Para uma forma bidimensional \n"
                + "2 - Para uma form tridimensional \n"));

        //Ainda será necessário fazer correções nesta parte
        if (opcao == 1) {
            bidimensional();
        }
        if (opcao == 2) {
            tridimensional();
        }
        /*else {
            JOptionPane.showMessageDialog(frame,"Opcao invalida!");
        }    */

    }

    //Menu caso o usuario escolha uma forma bidimensional
    public static void bidimensional() {
        
        Circulo circulo = new Circulo(); // Chamando objetos que compoe o circulo
        
        int escolha; // variavel para armazenar a escolha do usuario
        
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma que deseja calcular: \n"
                + "1- Círculo\n"
                + "2- Quadrado\n"));

        switch (escolha) {
            
            //caso o usuario escolha o circulo
            case 1:
                double tamanhoRaio;
                double area;
                tamanhoRaio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio:"));
                circulo.calcularArea(tamanhoRaio);
                area = tamanhoRaio;
                JOptionPane.showMessageDialog(null, "Informe o raio:" + area);             
                break;
            
            //caso o usuario escolha o quadrado    
            case 2:
                

           /* case 3:

            case 4:
                  */
                  
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
