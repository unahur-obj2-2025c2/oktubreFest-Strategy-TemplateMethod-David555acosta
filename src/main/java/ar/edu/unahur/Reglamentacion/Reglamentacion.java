package ar.edu.unahur.Reglamentacion;

import javax.management.relation.RelationException;

public class Reglamentacion {
    private static Reglamentacion instanceReglamentacion;
    private Double graduacionReglamentaria;
    
    public static Reglamentacion getInstance() {
        if (instanceReglamentacion == null) {
            instanceReglamentacion = new Reglamentacion();
        }
        return instanceReglamentacion;
    }


    public Double getGraduacionReglamentaria() {
        return this.graduacionReglamentaria;
    }
}
