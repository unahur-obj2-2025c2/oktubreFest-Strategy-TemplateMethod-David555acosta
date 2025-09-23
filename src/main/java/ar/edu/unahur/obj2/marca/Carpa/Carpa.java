package ar.edu.unahur.obj2.marca.Carpa;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.Pais.Pais;
import ar.edu.unahur.obj2.marca.Jarra.Jarra;
import ar.edu.unahur.obj2.marca.Marca.Marca;
import ar.edu.unahur.obj2.marca.Persona.Persona;

public class Carpa {
    private Integer limite;
    private Boolean tieneBandaTradicional;
    private Marca marca;
    Set<Persona> personas = new HashSet<>();

    public Carpa(Integer limite, Boolean tieneBandaTradicional, Marca marca) {
        this.limite = limite;
        this.tieneBandaTradicional = tieneBandaTradicional;
        this.marca = marca;
    }

    public Integer getLimite() {
        return limite;
    }

    public Boolean getTieneBandaTradicional() {
        return tieneBandaTradicional;
    }

    public Marca getMarca() {
        return marca;
    }

    public Set<Persona> getPersonas() {
        return personas;
    }

    public Boolean dejaIngresar(Persona persona) {
        return personas.size() < this.limite && !persona.estaEbria();
    }

    public void entrar(Persona persona) {
        if (this.dejaIngresar(persona) && persona.quiereEntrar(this)) {
            this.personas.add(persona);
        }
    }

    public void servir(Double cantidad, Persona persona, Pais pais) {
        if (!this.personas.contains(persona)) {
            throw new IllegalArgumentException("No se le puede servir cerveza a una persona que no esta en la carpa");
        }

        persona.recibirCerveza(new Jarra(cantidad, this.marca, pais));
    }

    public Integer cantEbriosEmpodernidos() {
        return personas.stream().filter(persona -> persona.esEmpodernido()).toList().size();
    }

    public Boolean esHomogenea() {
        if (personas.isEmpty()) {
            throw new RuntimeException("No hay personas en la carpa");
        }
        Pais nacionalidad = personas.get(0).getNacionalidad();
        return personas.stream().allMatch(p -> p.getPais().equals(nacionalidad));
    }

}
