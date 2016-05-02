/*
 * PATRON SINGLETON 
 */
package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }
    
    public static Singleton getInstance(){
        return instance;
    }
}//fin class Singleton.singleton
