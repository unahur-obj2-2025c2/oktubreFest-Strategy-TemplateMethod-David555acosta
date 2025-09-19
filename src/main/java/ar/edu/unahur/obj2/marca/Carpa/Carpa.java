package ar.edu.unahur.obj2.marca.Carpa;

import ar.edu.unahur.obj2.marca.Marca.Marca;

public class Carpa {
    private Integer limite;
    private Boolean tieneBandaTradicional;
    private Marca marcaCerveza;

    //El template method se va a ejecutar con el comportamiento de cada persona

    public Carpa(Integer limite, Boolean tieneBandaTradicional, Marca marcaCerveza) {
        this.limite = limite;
        this.tieneBandaTradicional = tieneBandaTradicional;
        this.marcaCerveza = marcaCerveza;
    }
}
