package factory;

public class ProductoCaducable extends Producto{
//    Al heredar Producto tambien implementa la interfaz ProductoCreable
    private int diaCaducidad; 

    public int getDiaCaducidad() {
        return diaCaducidad;
    }

    public void setDiaCaducidad(int diaCaducidad) {
        this.diaCaducidad = diaCaducidad;
    }
}
