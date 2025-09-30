package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private Double peso;
    private List<Jarra> jarras = new ArrayList<>();
    private Boolean leGustaLamusicaTradicional;
    private Double nivelAguante;
    private Pais pais;

    public Persona(Double peso, List<Jarra> jarras, Boolean leGustaLamusicaTradicional, Double nivelAguante,
            Pais pais) {
        this.peso = peso;
        this.jarras = jarras;
        this.leGustaLamusicaTradicional = leGustaLamusicaTradicional;
        this.nivelAguante = nivelAguante;
        this.pais = pais;
    }

    public Double getPeso() {
        return peso;
    }

    public List<Jarra> getJarras() {
        return jarras;
    }

    public Boolean getLeGustaLamusicaTradicional() {
        return leGustaLamusicaTradicional;
    }

    public Boolean leGustaEsteTipoDeCerveza(Marca marca) {
        return switch (pais.name()) {
            case "BELGICA" -> marca.getContenidoLupulo() > 4;
            case "CHECA" -> marca.graduacion() > 8;
            default -> Boolean.TRUE; // aleman le gustan todas al igual que cualquier otro
        };
    }

    public Boolean quiereEntrar(Carpa carpa) {
        return 
    }
}
