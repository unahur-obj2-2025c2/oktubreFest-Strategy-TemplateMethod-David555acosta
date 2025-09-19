package ar.edu.unahur.obj2.marca.Marca;

public class Rubia extends Marca {
    private Double graduacionX;

    public Rubia(Integer lupulo, String paisDeFabrica, Double contenidoLitros, String nombre) {
        super(lupulo, paisDeFabrica, contenidoLitros, nombre);
        //TODO Auto-generated constructor stub
    }

        public Rubia(Integer lupulo, String paisDeFabrica, Double contenidoLitros, String nombre , Double graduacionX) {
        super(lupulo, paisDeFabrica, contenidoLitros, nombre);
        this.graduacionX = graduacionX;
    }
}
