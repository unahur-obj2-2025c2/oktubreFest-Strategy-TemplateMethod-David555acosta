package ar.edu.unahur.obj2.marca.Marca;

import ar.edu.unahur.Pais.Pais;

public abstract class Marca {
    private Integer cantLupulo;
    private Pais pais;

    

    public Marca(Integer cantLupulo, Pais pais) {
        this.cantLupulo = cantLupulo;
        this.pais = pais;
    }

    public Integer getCantLupulo() {
        return cantLupulo;
    }

    public Pais getPais() {
        return pais;
    }

    public abstract double porcentajeAlcohol(); //TEMPLATE METHOD
}
