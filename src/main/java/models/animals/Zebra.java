package models.animals;

import models.subtypes.Herbivorous;

import java.util.Arrays;
import java.util.List;

/**
 * Created by luis on 09/02/18.
 */
public class Zebra extends Herbivorous{

    public void correr(Integer x, String... args ) {
        List<String> argsList = Arrays.asList(args);
        argsList.stream().forEach((String e)->{
            System.out.println(e);
        });
    }
}
