package ar.edu.unahur.obj2.marca;

public class Negra extends Marca {
    /*
     * Por otro lado, la graduación de una marca de cerveza negra se calcula
     * como el mínimo entre la graduación reglamentaria y el doble de su contenido
     * de
     * lúpulo. La graduación reglamentaria es mundial, o sea que es única para todas
     * lasmarcas de cerveza negra del mundo; puede cambiar con el tiempo.
     */

     
    

    public Negra(Integer lupulo, String paisDeFabrica, Double contenidoLitros, String nombre) {
        super(lupulo, paisDeFabrica, contenidoLitros, nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double graduacion() {
        return Math.min(graduacionReglamentaria,lupulo);
    }

}
