package ar.edu.unahur.obj2.marcas;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Carpa;
import ar.edu.unahur.obj2.Jarra;
import ar.edu.unahur.obj2.Negra;
import ar.edu.unahur.obj2.Pais;
import ar.edu.unahur.obj2.Persona;
import ar.edu.unahur.obj2.Roja;
import ar.edu.unahur.obj2.Rubia;

public class MarcaTest {
    @Test
    public void PruebaBasica() {
        /*
         * Saber el contenido de alcohol de una jarra de cerveza. Ej: una jarra de
         * cerveza de medio litro de la marca Hofbräu (suponiendo que tiene 8 % de
         * graduación alcohólica) tiene 0.5 * 0.08 = 0.04 litros de alcohol.
         * 
         * Saber el total de alcohol que ingirió una persona (en base a las jarras de
         * cerveza que compró).
         * 
         * Saber si una persona está ebria o no.
         * 
         * Saber si a una persona le gusta, o no, una determinada marca de cerveza.
         */

        Roja Hofbräu = new Roja(10.0, Pais.CHECA, "Hofbrau");

        Rubia corona = new Rubia(2.0, Pais.BELGICA, "Corona");

        Negra guiness = new Negra(3.0, Pais.ALEMANIA, "Guiness");

        Carpa carpa1 = new Carpa(5, false, guiness);

        Jarra jarra1 = new Jarra(1.0, corona, carpa1);

        Jarra jarra2 = new Jarra(1.0, corona, carpa1);

        Jarra jarra3 = new Jarra(1.0, corona, carpa1);

        Persona david = new Persona(50.0, true, 200.0, Pais.ALEMANIA);

        Persona pepe = new Persona(50.0, true, 200.0, Pais.ALEMANIA);

        Persona carlos = new Persona(50.0, true, 200.0, Pais.ALEMANIA);

        Persona pablo = new Persona(50.0, true, 200.0, Pais.ALEMANIA);

        Persona jose = new Persona(50.0, true, 200.0, Pais.ALEMANIA);

    }

}
