package ar.edu.unahur.obj2.marca.Jarra;

import ar.edu.unahur.obj2.marca.Marca.Marca;
import ar.edu.unahur.Pais.Pais;

public class Jarra {

    // En la fiesta, la cerveza se vende en jarras.
    // De cada jarra de cerveza sabemos su capacidad en litros y de qué marca es.

    private Double capacidadEnLitros;
    private Marca marca;
    private Pais pais;

    public Jarra(Double capacidadEnLitros, Marca marca, Pais pais) {
        this.capacidadEnLitros = capacidadEnLitros;
        this.marca = marca;
        this.pais = pais;
    }

    public Pais getPais() {
        return this.pais;
    }

    public Double getCapacidadEnLitros() {
        return capacidadEnLitros;
    }

    public Marca getMarca() {
        return marca;
    }

}
