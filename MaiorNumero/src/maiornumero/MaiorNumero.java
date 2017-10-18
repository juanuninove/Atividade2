/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumero;
// Essa classe implementa as operações de entrada de dados pelo teclado no console.
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciar e criar um objeto Scanner:
        Scanner ler = new Scanner(System.in);
        
        // Le o valor do teclado
        System.out.println("Digite o valor de x: ");
        int x = ler.nextInt();
        
        // Le o valor do teclado
        System.out.println("Digite o valor de y: ");
        int y = ler.nextInt();
        
        
        // Testa a condição e imprimi verdadeiro ou falso
        if (x>y){
            System.out.println("O maior eh: "+x);
        }else {
            System.out.println("O maior eh: "+y);
        }
    }
    
}
