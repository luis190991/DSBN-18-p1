package models.subtypes;

import models.Animal;
import models.interfaces.Consumidor;

/**
 * Modelo que representa un {@code models.Animal}, que consume carne.
 * @author Luis Antonio Ramirez
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */
public abstract class Carnivorous extends Animal implements Consumidor{

    public void comer(){
        System.out.println("Como cómo un carnivoro.");
    }


}
