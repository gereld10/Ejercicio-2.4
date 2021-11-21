package com.example.pm01firmadigital.Transacciones;

import java.sql.Blob;

public class Transacciones
{
    /* tablas */
    public static final String tablaAsignatura = "asignatura";
    /* Campos */
    public static final String Descripcion = "Descripcion";
    public static final String Firma = "Firma";

    /* tablas - CREATE , DROP */
    public static final String CreateTableAsignatura = "CREATE TABLE personas(Descripcion INTEGER PRIMARY KEY AUTOINCREMENT, Firma BLOB)";

    public static final String DropTableAsignatura  = "DROP TABLE IF EXISTS personas";

    /* Creacion del nombre de la base de datos */
    public static final String NameDataBase = "DBasignatura";

}
