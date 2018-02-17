package models;

import models.enums.Genero;

import java.awt.*;

/**
 * Created by luis on 09/02/18.
 */
public class Animal {

    private Genero genero;
    private Color color;
    private Double peso;
    private Double altura;
    private Boolean hiberna;

    public Animal() {
        this.genero = Genero.FEMENINO;
        this.color = Color.BLACK;
        this.peso = 0.1d;
        this.altura = 0.1d;
        this.hiberna = Boolean.FALSE;
    }

    public Animal(Genero genero) {
        this();
        this.genero = genero;
    }

    public Animal(Genero genero, Color color) {
        this(genero);
        this.color = color;
    }

    public Animal(Genero genero, Color color, Double peso) {
        this(genero, color);
        this.peso = peso;
    }

    public Animal(Genero genero, Color color, Double peso, Double altura) {
        this(genero, color, peso);
        this.altura = altura;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getHiberna() {
        return hiberna;
    }

    public void setHiberna(Boolean hiberna) {
        this.hiberna = hiberna;
    }
}
