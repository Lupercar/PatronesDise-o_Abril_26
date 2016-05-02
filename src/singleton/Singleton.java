/*
 *  PATRON SINGLETON 
 *  - Constructor privado evitando el "new"
 *  - Tiene un metodo public static para obtener el objeto
 *  - Tiene una propiedad private static que apuntara al objeto
 */
package singleton;

public class Singleton {
    //1 forma de hacerlo creando aqui el objeto
    private static Singleton instance = new Singleton();

    private Singleton() {
    }
    
    public static Singleton getInstance(){
        return instance;
    }
}//fin class Singleton.singleton
