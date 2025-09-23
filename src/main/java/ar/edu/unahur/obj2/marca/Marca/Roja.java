package ar.edu.unahur.obj2.marca.Marca;

import ar.edu.unahur.Pais.Pais;
import ar.edu.unahur.Reglamentacion.Reglamentacion;

public class Roja extends Marca {

    public Roja(Integer cantLupulo, Pais pais) {
        super(cantLupulo, pais);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double porcentajeAlcohol() {
        // TODO Auto-generated method stub
        return Math.min(Reglamentacion.getInstance().getGraduacionReglamentaria(),
                getCantLupulo() * 2) * 1.25;
    }
}
