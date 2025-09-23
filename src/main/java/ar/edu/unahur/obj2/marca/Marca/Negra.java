package ar.edu.unahur.obj2.marca.Marca;

import ar.edu.unahur.Pais.Pais;
import ar.edu.unahur.Reglamentacion.Reglamentacion;

public class Negra extends Marca {

    /*
     * Por otro lado, la graduación de una marca de cerveza negra se calcula
     * como el mínimo entre la graduación reglamentaria y el doble de su contenido
     * de
     * lúpulo. La graduación reglamentaria es mundial, o sea que es única para todas
     * lasmarcas de cerveza negra del mundo; puede cambiar con el tiempo.
     */

    public Negra(Integer cantLupulo, Pais pais) {
        super(cantLupulo, pais);
        // TODO Auto-generated constructor stub
    }

    /**
     * @return
     */
    @Override
    public double porcentajeAlcohol() {
        return Math.min(Reglamentacion.getInstance().getGraduacionReglamentaria()
        , getCantLupulo() * 2);
    }
}
