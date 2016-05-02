/*
 *  PATRON SINGLETON 
 *  Sirve para crear un objeto que se encuentre solo una vez 
 *  en memoria. Siempre que pidamos un objeto de esa clase
 *  nos devuelve el mismo objeto.
 *
 *  Condiciones:
 *  - Constructor privado evitando el "new"
 *  - Tiene un metodo public static para obtener el objeto
 *  - Tiene una propiedad private static que apuntara al objeto
 */
package singleton;

public class Singleton {
    //2Forma instance a null, equivalente al anterior
    private static Singleton instance=null;

    private Singleton() {
    }
    
    public static Singleton getInstance(){
        //ponemos una condicion 
        if(instance == null)
            instance = new Singleton(); 
        return instance;
    }
}//fin class Singleton.singleton
