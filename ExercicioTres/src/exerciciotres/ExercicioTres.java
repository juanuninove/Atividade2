
package exerciciotres;

/**
 *
 * @author Juan
 */
public class ExercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        int res;
        
        System.out.print("Multiplicação dos números Pares: \n");
        
        for(num=0; num<31; num++){
            
            if((num % 2)==0){
                res=num*num;
                System.out.print(res + "\n");
            }
        }
        
        System.out.print("\n Soma dos números Ímpares: \n");
        
         for(num=0; num<31; num++){
            
            if((num % 2)!=0){
                res=num+num;
                System.out.print(res + "\n");
            }
        }
    }
    
}
