package com.example.pm01firmadigital;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.pm01firmadigital.Transacciones.Transacciones;


public class SQLiteConexion extends SQLiteOpenHelper
{
    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, dbname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(Transacciones.CreateTableAsignatura);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(Transacciones.DropTableAsignatura);
        onCreate(db);
    }


}
