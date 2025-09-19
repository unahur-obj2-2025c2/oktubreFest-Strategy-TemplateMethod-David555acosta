package ar.edu.unahur.obj2.marca.Jarra;

public class Jarra {

    // En la fiesta, la cerveza se vende en jarras.
    // De cada jarra de cerveza sabemos su capacidad en litros y de qué marca es.

    protected Double capacidadLitros;
    private String marca;

    public Jarra(Double capacidadLitros, String marca) {
        this.capacidadLitros = capacidadLitros;
        this.marca = marca;
    }

    public Double getCapacidadLitros() {
        return capacidadLitros;
    }

    public String getMarca() {
        return marca;
    }


    

}
