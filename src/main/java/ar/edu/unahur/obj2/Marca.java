package ar.edu.unahur.obj2;

public abstract class Marca {
    private Double contenidoLupulo;
    private Pais pais;
    private String nombre;

    public Marca(Double contenidoLupulo, Pais pais, String nombre) {
        this.contenidoLupulo = contenidoLupulo;
        this.pais = pais;
        this.nombre = nombre;
    }

    public Double getContenidoLupulo() {
        return contenidoLupulo;
    }

    public Pais getPais() {
        return pais;
    }

    public String getNombre() {
        return nombre;
    }

    protected abstract Double graduacion();

}
