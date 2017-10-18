
package ingresso;

/**
 *
 * @author taina-santos
 */
public class CamaroteSuperior extends Vip{
    
    private double taxa;

    public void CamaroteSuperior(double valor) {
        this.taxa = (valor*3);
    }

    public double ImprimeValorCamarote(){
        return taxa;
    }

    
}
