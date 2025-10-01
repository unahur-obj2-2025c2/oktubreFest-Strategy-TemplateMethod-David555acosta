package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Carpa {
    private Integer limite;
    private Boolean tienenBandaDeMusicaTradicionalo;
    private Marca marca;
    private List<Persona> personas;

    public Carpa(Integer limite, Boolean tienenBandaDeMusicaTradicionalo, Marca marca) {
        this.limite = limite;
        this.tienenBandaDeMusicaTradicionalo = tienenBandaDeMusicaTradicionalo;
        this.marca = marca;
        this.personas = new ArrayList<>();
    }

    public Integer getLimite() {
        return limite;
    }

    public Boolean getTienenBandaDeMusicaTradicionalo() {
        return tienenBandaDeMusicaTradicionalo;
    }

    public Marca getMarca() {
        return marca;
    }

    public Integer totalPersonasEnCarpa() {
        return personas.size();
    }

    public Boolean dejaIngresar(Persona persona) {
        return !persona.estaEbria() && personas.size() < this.limite;
    }

    public void entrarPersona(Persona persona) {
        if (persona.quiereEntrar(this) && this.dejaIngresar(persona)) {
            personas.add(persona);
        }
    }

    public void servirJarra(Persona persona, Double capacidadLitros, Marca marca) {
        if (!personas.contains(persona)) {
            throw new IllegalArgumentException("No se le puede servir una cerveza a alguien que no esta en la carpa");
        }

        if (persona.leGustaEsteTipoDeCerveza(this.marca)) {
            persona.recibirJarra(new Jarra(capacidadLitros, marca, this));
        }
    }

    public Integer ebriosEmedernidos() {
        return personas.stream().filter(p -> p.todasLasJarrasCompradasSonDe1LitroOmas()).toList().size();
    }

    public Boolean esHomogenea() {
        Persona referencia = personas.get(0);
        return personas.stream().allMatch(p -> p.getPais().equals(referencia.getPais()));
    }

    public List<Persona> personasSinServirCerveza() {
        return personas.stream().filter(p -> p.noContieneEnSuListaDeCarpasQueSirvieronCerveza(this)).toList();
    }

}
