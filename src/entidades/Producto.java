package entidades;
//  Aplicamos el patron Java Bean
//    Propiedades privadas
//    constructor sin parametros y publico
//    todos los getter-setter publicos
public class Producto {
    private int codigo; 
    private String nombre; 

    public Producto() {
    }
    
//  A parte le pongo un constructor con parametros
    public Producto(int codigo, String nombre) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
//    Añado un metodo parecido al toString necesario para la parte grafica
    public String getDescripcion(){
        return this.getCodigo()+"/"+this.getNombre(); 
    }
}//fin class Producto.entidades
