package factory;

import factory.interfaces.ProductoCreable;

/*
    El patron factory se utiliza para crear objetos en memoria.
    A veces tenemos varias clases hijo de un padre. Con el factory 
    con un parametro podemos elegir el objeto de la clase hijo 
    que queremos que nos cree y devuelva.

    1.- Crear una interfaz que tiene que implementar las clases 
    que se van a ver afectadas por el patron factory. En la interfaz
    definimos la funcionalidad comun, entre las clase padre y 
    las hijas.
*/
public class ProductoFactory {
//    La factoria tiene un metodo que devuelve la interfaz
    public ProductoCreable newInstance(int codigo, String nombre){
        
    }
}//fin class ProductoFactory.factory
