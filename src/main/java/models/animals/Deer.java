package models.animals;

import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Modelo que representa un Venado dentro de la aplicación.
 * @author Luis Antonio Ramirez
 * @since 1.0
 * @version 1.0
 */
public class Deer extends Herbivorous implements Consumidor{


    @Override
    public void comer() {
        System.out.println("mooooo");
    }

    @Override
    public String hablar(String lenguaje, Integer dialecto) {
        return null;
    }
}
