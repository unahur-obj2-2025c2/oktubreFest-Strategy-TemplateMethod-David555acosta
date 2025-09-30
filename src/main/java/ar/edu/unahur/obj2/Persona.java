package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private Double peso;
    private List<Jarra> jarras;
    private Boolean leGustaLamusicaTradicional;
    private Double nivelAguante;
    private Pais pais;

    public Persona(Double peso, Boolean leGustaLamusicaTradicional, Double nivelAguante,
            Pais pais) {
        this.peso = peso;
        this.jarras = new ArrayList<>();
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

    public Double getNivelAguante() {
        return nivelAguante;
    }

    public Pais getPais() {
        return pais;
    }

    public Boolean getLeGustaLamusicaTradicional() {
        return leGustaLamusicaTradicional;
    }

    public Boolean estaEbria() {
        Double totalIngerido = jarras.stream().mapToDouble(j -> j.getCapacidadEnLitros()).sum();
        return totalIngerido * this.peso > this.nivelAguante;
    }

    public Boolean leGustaEsteTipoDeCerveza(Marca marca) {
        return switch (pais.name()) {
            case "BELGICA" -> marca.getContenidoLupulo() > 4;
            case "CHECA" -> marca.graduacion() > 8;
            default -> Boolean.TRUE; // aleman le gustan todas al igual que cualquier otro
        };
    }

    private Boolean esPar(Integer n) {
        return n % 2 == 0;
    }

    private Boolean noEsAlemanaLeGustaLaCervezaYCoincidenEnMusica(Marca marca, Boolean estadoMusica) {
        return this.pais != Pais.ALEMANIA && this.leGustaEsteTipoDeCerveza(marca)
                && this.leGustaLamusicaTradicional == estadoMusica;
    }

    private Boolean restriccionesPersonaAlemana(Integer cantPersonas) {
        return this.pais == Pais.ALEMANIA &&
                esPar(cantPersonas);
    }

    public Boolean quiereEntrar(Carpa carpa) {
        return this.noEsAlemanaLeGustaLaCervezaYCoincidenEnMusica(carpa.getMarca(),
                carpa.getTienenBandaDeMusicaTradicionalo())
                || restriccionesPersonaAlemana(carpa.totalPersonasEnCarpa());
    }

    public void recibirJarra(Jarra jarra) {
        jarras.add(jarra);
    }

    public Boolean todasLasJarrasCompradasSonDe1LitroOmas() {
        return jarras.stream().allMatch(j -> j.getCapacidadEnLitros() > 1.0);
    }

    public Boolean esPatriota() {
        Jarra referencia = jarras.get(0);
        return jarras.stream().allMatch(j -> j.getMarca().equals(referencia.getMarca()));
    }

    public Integer coincidencias(Persona persona) {
        Integer cant = 0;
        for (Jarra jarra : jarras) {
            for (Jarra jarra2 : persona.getJarras()) {
                if (jarra.equals(jarra2)) {
                    cant += 1;
                }
            }
        }
        return cant;
    }

    public Integer diferencias(Persona persona) {
        Integer cant = 0;
        for (Jarra jarra : jarras) {
            for (Jarra jarra2 : persona.getJarras()) {
                if (jarra.equals(jarra2)) {
                    cant += 1;
                }
            }
        }
        return cant;
    }

    public Boolean sonCompatibles(Persona persona) {
        return coincidencias(persona) > diferencias(persona);
    }

    public List<Carpa> carpasQueSirviceronCerveza() {
        return jarras.stream().map(j -> j.getCarpaServicio()).toList();
    }

    public Boolean noContieneEnSuListaDeCarpasQueSirvieronCerveza(Carpa carpa) {
        return !carpasQueSirviceronCerveza().contains(carpa);
    }

    public Boolean estaEntrandoEnElVicio() {
        Boolean estado = true;
        Jarra anterior = jarras.get(0);

        for (int i = 1; i < jarras.size(); i++) {
            if (jarras.get(i).getCapacidadEnLitros() >= anterior.getCapacidadEnLitros()) {
                return estado = false;
            }
            anterior = jarras.get(i);
        }

        return estado;
    }
}
