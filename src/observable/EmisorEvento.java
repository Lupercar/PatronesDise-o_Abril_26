package observable;

import java.util.ArrayList;
import java.util.List;

public class EmisorEvento {
    private int valor;
    private List<EmisorEventoListener> oyentes = new ArrayList<>(); 

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
        
        //se lanza el evento (se avisa de algo)
        this.avisarOyentes(); 
    }
    
    public void EmisorEventoAdd(EmisorEventoListener oyente){
        oyentes.add(oyente); 
    }

    private void avisarOyentes() {
        //recorre la lista de oyentes
        for(EmisorEventoListener oyente : oyentes){
            oyente.realizarOperacion(this.getValor());
        }
    }
}//fin class EmisorEvento.observable
