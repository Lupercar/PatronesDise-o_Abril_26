package Consola;

import singleton.Singleton;

public class App {

    public static void main(String[] args) {
//      con metodos estáticos no preciso una instancia 
//      con el mismo nombre de la clase tengo acceso a los 
//      metodos estaticos.
        Singleton s = Singleton.getInstance(); //crea el objeto sino existe y lo devuelve
    }
}
