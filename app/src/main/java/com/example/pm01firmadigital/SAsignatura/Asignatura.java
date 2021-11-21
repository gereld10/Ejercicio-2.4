package com.example.pm01firmadigital.SAsignatura;

import java.sql.Blob;

public class Asignatura
{
    private String Descripcion;
    private Blob Firma;

    public Asignatura(String descripcion, Blob firma) {
        Descripcion = descripcion;
        Firma = firma;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Blob getFirma() {
        return Firma;
    }

    public void setFirma(Blob firma) {
        Firma = firma;
    }
}
