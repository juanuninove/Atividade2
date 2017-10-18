package ingresso;

/**
 *
 * @author taina-santos
 */
public class Vip extends Ingresso {
    
    private double valor_vip;
    
    public void ValorVip(double valor){
        this.valor_vip = (valor*2);
    }
    
    public double ImprimeValorVip(){
        return valor_vip;
    }
}
