package ar.edu.unahur.obj2.marca.Persona;

import java.util.List;

import ar.edu.unahur.obj2.marca.Jarra.Jarra;
import ar.edu.unahur.obj2.marca.Marca.Marca;

public class Checos extends Persona {

    public Checos(Integer peso, List<Jarra> jarrasCompradas, Boolean leGustaMusicaTradicional, Integer nivelAguante) {
        super(peso, jarrasCompradas, leGustaMusicaTradicional, nivelAguante);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean leGustaCervezaX(Marca cerverza) {
        // TODO Auto-generated method stub
        return cerverza.graduacion() > 8.0;
    }

    

}
