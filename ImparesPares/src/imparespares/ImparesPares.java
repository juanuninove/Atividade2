/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imparespares;

/**
 *
 * @author Juan
 */
public class ImparesPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int impar = 0;
        long par = 1;
        
        for (int i = 1; i <= 30; i += 2) {
            impar += i;
            par *= (i + 1);
            System.out.println(i);
        }
        System.out.println(impar);
        System.out.println(par);

    }

}
