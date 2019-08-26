/*Crie uma aplicação que permite ao usuário criar forma bidimensionais e tridimensionais.  Ao acessar a aplicação o usuário
poderá criar uma forma (por exemplo um círculo, um quadrado, um cubo, um cilindro, etc) e obter algumas informações para a 
forma criada, por exemplo a área, o perímetro, o volume, etc.
Observações importantes:
● Não é necessário que sua aplicação faça conexão com alguma banco de dados;
● Não é obrigatório a criação de uma interface gráfica para o usuário.
● Na classe principal, coloque o nome e o prontuário dos desenvolvedores da
aplicação.
 */
package Principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author ht3000966 - Maciel Sandes de Oliveira
 * @author ht
 */
public class Principal {

    //classe principal 
    public static void main(String[] args) {

        //principal variaveis  
        int opcao = 0;// variavel para guardar opcao escolhida pelo usuario
        double base, area, altura, volume;
        double aresta, lado, perimetro, raio; // usada para armazer a informação digitada pelo usuario

        //orientação passada pela processora para criar uma lista de objetos
        //ArrayList<Formas> listaFormas = new ArrayList<Formas>(); 
       
        //instanciando os objetos
        Circulo circulo = new Circulo(); 
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Cubo cubo = new Cubo();
        Piramide piramide = new Piramide();

        while (opcao != 7) {

            //solicitando para que o usuario escolha uma forma gemétrica    
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das formas Gemétricas abaixo:\n"
                    + "0- Para Sair\n" + "1- Círculo\n" + "2- Quadrado\n" + "3- Triangulo\n" + "4- Cubo\n" 
                    + "5- Piramide\n"));

            switch (opcao) {

                //caso o usuario escolha o circulo
                case 1:
                    raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do raio: "));
                    circulo.setRaio(raio);
                    area = circulo.calcularArea();
                    perimetro = circulo.CalcularPerimetro();
                    JOptionPane.showMessageDialog(null, "A area é: " + area + " \n O perimetro é: " + perimetro);
                    break;

                //caso o usuario escolha o quadrado    
                case 2:
                    //solicita informações para o usuario
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor dos lados:"));
                    quadrado.setLado(lado);
                    area = quadrado.calcularArea();
                    perimetro = quadrado.CalcularPerimetro();

                    //Mostra para o usuario o resultado da calculo                
                    JOptionPane.showMessageDialog(null, "A area do quadrado é  :" + area + " \n O perimetro do retângulo é "
                            + perimetro);
                    break;
                
                //Caso o usuario escolha o triângulo    
                case 3:                         
                    // solicita que o usuario informe o valor da base e da altura
                    base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: "));
                    triangulo.setBase(base);
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura:"));
                    triangulo.setAltura(altura);
               
                     //Chama a classe efetua o calculo
                    area = triangulo.calcularArea();
                    perimetro = triangulo.CalcularPerimetro();
                   
                    //Mostra para o usuario o resultado do calculo                
                    JOptionPane.showMessageDialog(null, "A area do triangulo é: " + area + " \n O perimetro do triângulo é: "
                            + perimetro);
                    break;
                
                //Caso o usuario escolha o cubo    
                case 4:
                    aresta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da aresta: "));
                    
                     //atualiza o na classe cubo o valor recebido pelo usuario
                    cubo.setAresta(aresta);
                    
                    // chamado o metodo que ira fazer o calculo e armazenará numa variavel local
                    perimetro = cubo.calcularPerimetro();
                    volume = cubo.CalcularVolume();
                    
                    JOptionPane.showMessageDialog(null, "A area do Cubo: " + perimetro + " \n O volume do Cubo é: "
                            + volume);                
                break;
                
                //calculando uma piramide
                case 5:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base de sua pirâmide: "));
                    piramide.setBase(base);
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura de sua pirâmide: "));
                    piramide.setAltura(altura);
                    
                   //atualiza na classe cubo o valor recebido pelo usuario
                    piramide.CalcularVolume();
                    piramide.calcularPerimetro();
                    
                    // chamado o metodo que ira fazer o calculo e armazenará numa variavel local
                    perimetro = cubo.calcularPerimetro();
                    volume = cubo.CalcularVolume();
                    
                    // mostra informação para o usuario
                    JOptionPane.showMessageDialog(null, "O perimetro é de : " + perimetro + " \n O tamanho do volume é: "
                            + volume);                
                break;
                
                default:
                    System.exit(0);
                    break;

            }

        }

    }
}

//Menu para o usuario escolher uma forma tridimensional 
/* public static void tridimensional() {
        
        Cubo cubo = new Cubo();
                
        int escolha;
       double area;
       
        escolha  = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma forma \n:"
                + "1 - Cubo \n "
                + "2- Paralelepido \n "
                +" 3- Paralelepido \n" ));


        switch (escolha){
                      
            case 1:
                double lado1;
                double lado2;
                double lado3;
                
                lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 1:"));
                lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 2:"));
                lado3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 3:"));
                
               //Chama a classe que ira fazer o calculo
                area = cubo.calcularCubo(lado1, lado2, lado3);
                
                JOptionPane.showMessageDialog(null, "A area e:" + area); 
                
            /* case 1:
                
            case 2:
                
            case 3:
    }*/
