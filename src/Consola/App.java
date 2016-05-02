package Consola;

import singleton.Singleton;
import swing.Ventana;

public class App {

    public static void main(String[] args) {
//      con metodos estáticos no preciso una instancia 
//      con el mismo nombre de la clase tengo acceso a los 
//      metodos estaticos.
        Singleton s = Singleton.getInstance(); //crea el objeto sino existe y lo devuelve
        
//        Mostreamos la pantalla grafica
        Ventana v = new Ventana(); 
        v.setVisible(true); //con true muestra la ventana con false no.
    }
}
