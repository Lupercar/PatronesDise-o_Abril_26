package observable;

/*
    El "patron Observer" se utiliza para avisar a otros objetos
    que un objeto a cambiado (lanzar un evento).
    1.-Nos obliga a crear una interfaz con metodos.
    2.-Los oyentes tienen que implementar la interfaz.
    3.-Emisor tiene que tener metodos para add y delete un oyente al que avisar.
    4.-Tiene que tener una lista de la interfaz donde ir almacenando los 
    oyentes a avisar.
    5.-Cuando nos interese en el emisor avisamos a los oyentes llamando al 
    metodo de la interfaz que tiene que implementar el oyente
    6.-El objeto oyente se tiene que añadir como un oyente del emisor.
 */
public class Oyente implements EmisorEventoListener {

    @Override
    public void realizarOperacion(int valor) {
//        Metodo que se va a ejecutar cuando el emisor envie el evento
//        indicando que ha pasado algo.
        System.out.println("Oyente valor recibido: " + valor);
    }

}//fin class Oyente.observable
