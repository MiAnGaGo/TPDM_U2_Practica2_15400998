package mx.edu.ittepic.tpdm_u2_practica2_15400998

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TablaCliente(context: Context,
                   name: String?,
                   factory: SQLiteDatabase.CursorFactory?,
                   version: Int): SQLiteOpenHelper(context,name,factory,version){
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE CLIENTE (idcliente INTEGER NOT NULL,notelefono INTEGER,nombre varchar(400),domicilio varchar(400),idempresa INTEGER,CONSTRAINT fk_CLIENTE_EMPRESA_1 FOREIGN KEY (idempresa) REFERENCES EMPRESA (idempresa))")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}