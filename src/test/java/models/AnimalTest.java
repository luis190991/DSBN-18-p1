package models;

import com.sun.source.tree.AssertTree;
import models.animals.Deer;
import models.animals.Elephant;
import models.animals.Lion;
import models.animals.Zebra;
import models.enums.Genero;
import models.interfaces.Consumidor;
import models.subtypes.Carnivorous;
import models.subtypes.Herbivorous;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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


    @Test
    public void testComer(){
        List<Consumidor> animals = new ArrayList<>();
        Deer d = new Deer();
        Elephant e = new Elephant();

        System.out.println(e instanceof Elephant);
        System.out.println(e instanceof Herbivorous);
        Carnivorous c = new Lion();
        System.out.println(c instanceof Lion);
        System.out.println(c instanceof Carnivorous);
        Herbivorous er = new Herbivorous();
        System.out.println(er instanceof Herbivorous);
        System.out.println(er instanceof Elephant);
        Lion l = new Lion();
        Zebra z = new Zebra();
        Zebra z2 = new Zebra();
        z.correr(5, "recio", "despacio", "rapido", "lento");

        animals.add(d);
        animals.add(e);
        animals.add(l);


        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }

        Animal animal= new Animal(Genero.FEMENINO);
        System.out.println(animal);

        System.out.println("-----------------------------------");

        for(Consumidor a : animals){
            a.comer();
        }

        System.out.println("-----------------------------------");

        animals.stream().forEach((Consumidor x)->{
            x.comer();
        });


    }

    @Test
    public void instanceTest(){
        Carnivorous puma = new Carnivorous() {

            @Override
            public String hablar(String x, Integer y){
                return null;
            }
        };
    }


    @Test
    public void probarManzanas(){
        Elephant e = new Elephant();
        Assert.assertTrue("Tengo 5 o más manzanas".equals(e.manzanas(5)));
        Assert.assertTrue("Tengo 5 o más manzanas".equals(e.manzanas(6)));
        Assert.assertTrue("No tengo 5 o más manzanas".equals(e.manzanas(4)));
    }
}
