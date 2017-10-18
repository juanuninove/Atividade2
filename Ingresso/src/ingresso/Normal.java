package ingresso;

/**
 *
 * @author taina-santos
 */
public class Normal extends Ingresso{
    private double valor_normal;
    
    public void ValorNormal(double valor_normal){
        this.valor_normal = valor_normal;
    }
    
    public double ImprimeValorNormal(){
        return valor_normal;
    }
}
