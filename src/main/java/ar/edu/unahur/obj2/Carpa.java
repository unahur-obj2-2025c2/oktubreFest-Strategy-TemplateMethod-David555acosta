package ar.edu.unahur.obj2;

public class Carpa {
    private Integer limite;
    private Boolean tienenBandaDeMusicaTradicionalo;
    private Marca marca;

    public Carpa(Integer limite, Boolean tienenBandaDeMusicaTradicionalo, Marca marca) {
        this.limite = limite;
        this.tienenBandaDeMusicaTradicionalo = tienenBandaDeMusicaTradicionalo;
        this.marca = marca;
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

}
