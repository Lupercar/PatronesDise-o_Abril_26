package observable;

import java.util.ArrayList;
import java.util.List;

public class EmisorEvento {
    private int valor;
    private List<OyenteListener> oyentes = new ArrayList<>(); 

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}//fin class EmisorEvento.observable
