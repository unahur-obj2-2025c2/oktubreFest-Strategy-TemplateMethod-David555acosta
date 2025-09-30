package ar.edu.unahur.obj2;

public class Rubia extends Marca {
    private Double graduacionPropia;

    public Rubia(Double contenidoLupulo, Pais pais, String nombre) {
        super(contenidoLupulo, pais, nombre);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Double graduacion() {
        // TODO Auto-generated method stub
        return this.graduacionPropia;
    }

}
