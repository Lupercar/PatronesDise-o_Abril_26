package entidades;
//    Aplico el patron Singleton para que Repositorio sea unico

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private static Repositorio instance = new Repositorio(); 
    
//    Hago una lista de Producto
    private List<Producto> productos = new ArrayList<>(); 
    
    private Repositorio() {
//      En el constructor añado 3 productos
        productos.add(new Producto(1, "Producto 1")); 
        productos.add(new Producto(2, "Producto 2")); 
        productos.add(new Producto(3, "Producto 3")); 
    }
    
    static public Repositorio getInstance(){
        return instance; 
    }
}//fin class Repositorio.entidades
