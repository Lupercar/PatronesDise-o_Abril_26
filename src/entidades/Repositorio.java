package entidades;
//    Aplico el patron Singleton para que Repositorio sea unico

import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

public class Repositorio {
    private static Repositorio instance = new Repositorio(); 
    
//    Hago una lista de Producto
    private List<Producto> productos = new ArrayList<>();  
//    Creo otra lista con la ObservableList de Producto
    private ObservableList<Producto> productosObservables = ObservableCollections.observableList(productos); 
    
    private Repositorio() {
//      En el constructor añado 3 productos
        productosObservables.add(new Producto(1, "Producto 1")); 
        productosObservables.add(new Producto(2, "Producto 2")); 
        productosObservables.add(new Producto(3, "Producto 3")); 
    }
    
    static public Repositorio getInstance(){
        return instance; 
    }
    
//    retorno la lista de productos
    public List<Producto> getProductos(){
        return productosObservables;
    }
}//fin class Repositorio.entidades
