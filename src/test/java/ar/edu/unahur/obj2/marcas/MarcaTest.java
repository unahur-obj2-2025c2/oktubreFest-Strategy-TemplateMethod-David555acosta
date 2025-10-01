package ar.edu.unahur.obj2.marcas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

        Rubia corona = new Rubia(5.0, Pais.BELGICA, "Corona");

        Rubia corona2 = new Rubia(2.0, Pais.BELGICA, "Corona");

        Negra guiness = new Negra(5.0, Pais.ALEMANIA, "Guiness");

        Carpa carpa1 = new Carpa(5, true, guiness);

        Carpa carpa2 = new Carpa(3, true, corona2);

        Carpa carpa3 = new Carpa(3, false, corona);

        Jarra jarra1 = new Jarra(1.0, corona, carpa1);

        Jarra jarra2 = new Jarra(1.0, corona, carpa1);

        Jarra jarra3 = new Jarra(1.0, corona, carpa1);

        Persona david = new Persona(50.0, true, 200.0, Pais.ALEMANIA);

        Persona pepe = new Persona(30.0, true, 100.0, Pais.BELGICA);

        Persona carlos = new Persona(50.0, false, 140.0, Pais.CHECA);

        Persona pablo = new Persona(50.0, true, 200.0, Pais.BELGICA);

        Persona jose = new Persona(50.0, true, 200.0, Pais.BELGICA);

        assertTrue(david.leGustaEsteTipoDeCerveza(guiness));
        assertTrue(pepe.leGustaEsteTipoDeCerveza(Hofbräu));

        carpa1.entrarPersona(david);
        carpa1.servirJarra(david, 5.0, guiness);
        carpa1.servirJarra(david, 1.5, corona);
        carpa1.servirJarra(david, 1.5, corona2);
        assertTrue(david.estaEbria());
        assertEquals(8.0, david.totalIngerido());

        assertFalse(carpa2.dejaIngresar(david));
        assertFalse(jose.quiereEntrar(carpa3));
        assertTrue(pablo.quiereEntrar(carpa1));
        carpa1.dejaIngresar(pablo);
        carpa1.entrarPersona(pablo);
        carpa1.servirJarra(pablo, 1.5, guiness);
        carpa1.servirJarra(pablo, 1.5, corona);
        assertTrue(david.todasLasJarrasCompradasSonDe1LitroOmas());
        assertEquals(2, carpa1.ebriosEmedernidos());
        assertTrue(david.sonCompatibles(pablo));
    }

}
