package ar.edu.unahur.obj2;

public class Jarra {
    private Double capacidadEnLitros;
    private Marca marca;
    private Carpa carpaServicio;

    public Jarra(Double capacidadEnLitros, Marca marca, Carpa carpaServicio) {
        this.capacidadEnLitros = capacidadEnLitros;
        this.marca = marca;
        this.carpaServicio = carpaServicio;
    }

    public Double getCapacidadEnLitros() {
        return capacidadEnLitros;
    }

    public Marca getMarca() {
        return marca;
    }

    public Carpa getCarpaServicio() {
        return carpaServicio;
    }

}
