package ar.edu.unahur.obj2.marca;

public abstract class Marca {
    protected Integer lupulo;
    protected String paisDeFabrica;
    protected String nombre;
    protected Double graduacionReglamentaria = 0.2;

    public Marca(Integer lupulo, String paisDeFabrica, Double contenidoLitros, String nombre) {
        this.lupulo = lupulo;
        this.paisDeFabrica = paisDeFabrica;
        this.nombre = nombre;
    }

    public Marca(Integer lupulo2, String paisDeFabrica2, Integer contenidoLitros) {
        // TODO Auto-generated constructor stub
    }

    public void setGraduacionReglamentaria(Double graduacionReglamentaria) {
        this.graduacionReglamentaria = graduacionReglamentaria;
    }

    public Double graduacion() {
        return graduacionReglamentaria;
    }
}
