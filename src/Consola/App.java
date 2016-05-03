package Consola;

import observable.EmisorEvento;
import observable.Oyente;
import singleton.Singleton;
import swing.Ventana;

public class App {

    public static void main(String[] args) {
//      con metodos estáticos no preciso una instancia 
//      con el mismo nombre de la clase tengo acceso a los 
//      metodos estaticos.
        Singleton s = Singleton.getInstance(); //crea el objeto sino existe y lo devuelve
        
//        Mostreamos la pantalla grafica
//        Ventana v = new Ventana(); 
//        v.setVisible(true); //con true muestra la ventana con false no.

//        Creo un emisor y un oyente
        EmisorEvento e = new EmisorEvento(); 
        Oyente o = new Oyente(); 
        
        e.EmisorEventoAdd(o); //añado un oyente al emisor
        
        e.setValor(100); //al emiso le cambio el valor para que lance el evento
        //ejecuto a ver si el oyente se entera
        
    }
}
