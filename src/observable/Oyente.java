package observable;

/*
    El "patron Observer" se utiliza para avisar a otros objetos
    que un objeto a cambiado (lanzar un evento).
    1.-Nos obliga a crear una interfaz con metodos.
    2.-Los oyentes tienen que implementar la interfaz.
 */
public class Oyente implements OyenteListener {

    @Override
    public void realizarOperacion(int valor) {
//        Metodo que se va a ejecutar cuando el emisor envie el evento
//        indicando que ha pasado algo.
        System.out.println("Oyente valor recibido: " + valor);
    }

}//fin class Oyente.observable
