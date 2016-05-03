package factory;

import factory.interfaces.ProductoCreable;

public abstract class Producto implements ProductoCreable {
//    Ponemons lo que queremos que se guarde de un Producto
//    Hago que no se pueda instanciar esta clase, la hago abstracta
    private int codigo; 
    private String nombre; 

    public Producto(int codigo, String nombre) {
        setCodigo(codigo);
        setNombre(nombre);
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}//fin class Producto.factory
