package LSP_CORRETO;

import java.util.logging.Level;
import java.util.logging.Logger;

public class QuadradoNovo extends Paralelogramo {

    public QuadradoNovo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calculaArea() {
        if (getAltura() == getLargura()) {
            setArea(getAltura() * getLargura());
            return getArea();
        } else {
            try {
                throw new Exception("Os dois lados do quadrado precisam ser iguais");
            } catch (Exception ex) {
                Logger.getLogger(QuadradoNovo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

}
