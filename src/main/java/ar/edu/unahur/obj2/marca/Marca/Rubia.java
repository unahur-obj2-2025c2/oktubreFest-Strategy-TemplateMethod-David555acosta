package ar.edu.unahur.obj2.marca.Marca;

import ar.edu.unahur.Pais.Pais;

public class Rubia extends Marca {
    private Double graduacionAlcohol;

    public Rubia(Integer cantLupulo, Pais pais, double graduacionAlcohol) {
        super(cantLupulo, pais);
        this.graduacionAlcohol = graduacionAlcohol;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double porcentajeAlcohol() {

        return this.graduacionAlcohol;
    }
}
