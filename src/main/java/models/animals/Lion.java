package models.animals;

import models.Animal;
import models.interfaces.Consumidor;
import models.subtypes.Carnivorous;

/**
 * Created by luis on 09/02/18.
 */
public class Lion extends Carnivorous implements Consumidor{

    @Override
    public void comer() {
        System.out.println("chom chom");
    }

    @Override
    public String hablar(String lenguaje, Integer dialecto) {
        return "hablo como Leon";
    }
}
