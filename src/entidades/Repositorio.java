package entidades;
//    Aplico el patron Singleton para que Repositorio sea unico
public class Repositorio {
    private static Repositorio instance = new Repositorio(); 
    
    private Repositorio() {
    }
    
    static public Repositorio getInstance(){
        return instance; 
    }
}//fin class Repositorio.entidades
