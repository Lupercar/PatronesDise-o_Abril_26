package factory;

public class ProductoNoCaducable extends Producto{

    public ProductoNoCaducable(int codigo, String nombre) {
        super(codigo, nombre);
    }
//    Al heredar Producto tambien implementa la interfaz ProductoCreable
    
}
