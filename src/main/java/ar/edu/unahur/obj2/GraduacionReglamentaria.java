package ar.edu.unahur.obj2;

public class GraduacionReglamentaria {
    // Instancia única
    private static GraduacionReglamentaria instancia;

    // Valor reglamentario (double)
    private double graduacion;

    // Constructor privado
    private GraduacionReglamentaria() {
        this.graduacion = 42.0; // acá definís el valor reglamentario que corresponda
    }

    // Método estático que devuelve la instancia única
    public static GraduacionReglamentaria getInstance() {
        if (instancia == null) {
            instancia = new GraduacionReglamentaria();
        }
        return instancia;
    }

    // Método que devuelve la graduación reglamentaria
    public double obtenerGraduacion() {
        return graduacion;
    }

}
