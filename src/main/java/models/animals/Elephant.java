package models.animals;

import models.Animal;
import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Modelo que representa un {@link Elephant} dentro de la aplicación.
 * @author Luis Antonio Ramirez
 * @since 1.0
 * @version 1.0
 * @see Herbivorous
 */
public class Elephant extends Herbivorous implements Consumidor, Runnable, Cloneable{

    @Override
    public String toString() {
        return "Soy un elefante.";
    }

    @Override
    public void comer() {
        System.out.println("ñom, ñom");
    }

    @Override
    public String hablar(String lenguaje, Integer dialecto) {
        return null;
    }

    @Override
    public void run() {

    }

    public String manzanas(Integer numero){

        return numero >=5? "Tengo 5 o más manzanas" : "No tengo 5 o más manzanas";
    }



}
