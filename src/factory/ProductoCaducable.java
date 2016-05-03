package factory;

public class ProductoCaducable extends Producto{
//    Al heredar Producto tambien implementa la interfaz ProductoCreable
    private int diaCaducidad; 

    public ProductoCaducable(int codigo, String nombre, int diaCaducidad) {
        super(codigo, nombre);
        setDiaCaducidad(diaCaducidad);
    }
    
    

    public int getDiaCaducidad() {
        return diaCaducidad;
    }

    public void setDiaCaducidad(int diaCaducidad) {
        this.diaCaducidad = diaCaducidad;
    }
}
