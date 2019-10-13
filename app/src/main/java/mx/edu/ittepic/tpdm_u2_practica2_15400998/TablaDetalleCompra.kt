package mx.edu.ittepic.tpdm_u2_practica2_15400998

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TablaDetalleCompra(context: Context,
                  name: String?,
                  factory: SQLiteDatabase.CursorFactory?,
                  version: Int): SQLiteOpenHelper(context,name,factory,version){
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE DETALLECOMPRA (iddetalle INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,idalmacen INTEGER,cantidad INTEGER,precio float,idcompra INTEGER,CONSTRAINT fk_DETALLECOMPRA_ALMACEN_1 FOREIGN KEY (idalmacen) REFERENCES ALMACEN (ialmacen))")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}