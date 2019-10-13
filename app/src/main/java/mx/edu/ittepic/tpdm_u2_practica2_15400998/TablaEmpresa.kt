package mx.edu.ittepic.tpdm_u2_practica2_15400998

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TablaEmpresa(context: Context,
                   name: String?,
                   factory: SQLiteDatabase.CursorFactory?,
                   version: Int): SQLiteOpenHelper(context,name,factory,version){
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE EMPRESA (idempresa INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,descripcion varchar(30),domicilio varchar(30))")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}