package ar.edu.unahur.obj2;

public class Negra extends Marca {

    public Negra(Double contenidoLupulo, Pais pais, String nombre) {
        super(contenidoLupulo, pais, nombre);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Double graduacion() {
        // TODO Auto-generated method stub
        return Math.min(GraduacionReglamentaria.getInstance().obtenerGraduacion(),
                this.getContenidoLupulo() * 2);
    }

}
