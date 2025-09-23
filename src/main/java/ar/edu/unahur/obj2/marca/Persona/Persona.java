package ar.edu.unahur.obj2.marca.Persona;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.unahur.Pais.Pais;
import ar.edu.unahur.obj2.marca.Carpa.Carpa;
import ar.edu.unahur.obj2.marca.Jarra.Jarra;
import ar.edu.unahur.obj2.marca.Marca.Marca;

public class Persona {

    private Integer peso;
    private Boolean leGustaLaMusicaTradicional;
    private Integer nivelDeAguante;
    Set<Jarra> jarras = new HashSet<>();
    private Pais pais;

    public Persona(Integer peso, Boolean leGustaLaMusicaTradicional, Integer nivelDeAguante, Set<Jarra> jarras,
            Pais pais) {
        this.peso = peso;
        this.leGustaLaMusicaTradicional = leGustaLaMusicaTradicional;
        this.nivelDeAguante = nivelDeAguante;
        this.jarras = jarras;
        this.pais = pais;
    }

    public Integer getPeso() {
        return peso;
    }

    public Boolean getLeGustaLaMusicaTradicional() {
        return leGustaLaMusicaTradicional;
    }

    public Integer getNivelDeAguante() {
        return nivelDeAguante;
    }

    public Pais getPais() {
        return pais;
    }

    public Set<Jarra> getJarrasTomadas() {
        return jarras;
    }

    public void recibirCerveza(Jarra jarra) {
        this.jarras.add(jarra);
    }

    public Boolean estaEbria() {
        Double litrosConsumidos = jarras.stream().mapToDouble(j -> j.getCapacidadEnLitros()).sum();
        return litrosConsumidos * this.peso > this.nivelDeAguante;
    }

    public Boolean leInteresa(Marca marca) { // STRATEGY
        return switch (this.pais.name()) {
            case "BELGICA" ->
                marca.getCantLupulo() > 4;
            case "REPUBLICACHECA" ->
                marca.porcentajeAlcohol() > 8;
            case "ALEMANIA" ->
                true;
            default ->
                false;
        };
    }

    public Boolean quiereEntrar(Carpa carpa) {
        return this.leInteresa(carpa.getMarca()) &&
                this.leGustaLaMusicaTradicional == carpa.getTieneBandaTradicional()
                && this.evaluarSegunNacionalidad(carpa);
    }

    public Boolean evaluarSegunNacionalidad(Carpa unaCarpa) {
        return switch (pais.name()) {
            case "Alemania" -> unaCarpa.getPersonas().size() % 2 == 0;
            default -> Boolean.TRUE;
        };
    }

    public Boolean puedeEntrar(Carpa carpa) {
        return this.quiereEntrar(carpa) && carpa.dejaIngresar(this);
    }

    public Boolean esEmpodernido() {
        return jarras.stream().allMatch(jarra -> jarra.getCapacidadEnLitros() > 1);
    }

    public Boolean esPatriota() {
        return jarras.stream().allMatch(jarra -> jarra.getPais() == this.pais);
    }

    public Boolean sonCompatibles(Persona unaPersona) {
        Set<Marca> marcasPersona1 = this.jarras.stream().map(j -> j.getMarca()).collect(Collectors.toSet());
        Set<Marca> marcasPersona2 = unaPersona.getJarrasTomadas().stream().map(j -> j.getMarca())
                .collect(Collectors.toSet());
        Set<Marca> todasLasMarcas = new HashSet<>();
        todasLasMarcas.addAll(marcasPersona1);
        todasLasMarcas.addAll(marcasPersona2);
        Integer coincidencias = 0;
        for (Marca marca : marcasPersona1) {
            if (marcasPersona2.contains(marca)) {
                coincidencias += 1;
            }
        }
        return coincidencias > todasLasMarcas.size() / 2;
    }

}
