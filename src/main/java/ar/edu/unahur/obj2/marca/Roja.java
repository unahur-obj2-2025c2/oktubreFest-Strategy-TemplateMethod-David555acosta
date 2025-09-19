package ar.edu.unahur.obj2.marca;

public class Roja  extends Marca{
    
    public Roja(Integer lupulo, String paisDeFabrica, Double contenidoLitros, String nombre) {
        super(lupulo, paisDeFabrica, contenidoLitros, nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double graduacion() {
        // TODO Auto-generated method stub
        return Math.min(graduacionReglamentaria,lupulo) * 1.25;
    }



}
