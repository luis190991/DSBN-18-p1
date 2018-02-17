package models;

import models.enums.Genero;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luis on 16/02/18.
 */
public class AnimalTest {

    @Test
    public void instanciaAnimalTest(){
        Animal animal = new Animal();
        Assert.assertTrue(Genero.FEMENINO.equals(animal.getGenero()));
        Assert.assertFalse(Genero.MASCULINO.equals(animal.getGenero()));
    }

    @Test
    public void generoAnimalTest(){
        Assert.assertTrue(Genero.FEMENINO.getAmamanta());
    }
}
