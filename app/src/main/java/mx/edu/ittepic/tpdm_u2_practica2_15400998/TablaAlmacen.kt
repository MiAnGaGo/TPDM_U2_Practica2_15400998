package mx.edu.ittepic.tpdm_u2_practica2_15400998

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TablaAlmacen(context: Context,
                     name: String?,
                     factory: SQLiteDatabase.CursorFactory?,
                     version: Int): SQLiteOpenHelper(context,name,factory,version){
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE ALMACEN (ialmacen INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,producto varchar(400), cantidad INTEGER, precio float)")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}