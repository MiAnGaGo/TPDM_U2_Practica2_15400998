package mx.edu.ittepic.tpdm_u2_practica2_15400998

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TablaCompra(context: Context,
                   name: String?,
                   factory: SQLiteDatabase.CursorFactory?,
                   version: Int): SQLiteOpenHelper(context,name,factory,version){
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE COMPRA (idcompra INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,fecha date,idcliente INTEGER,total float,CONSTRAINT fk_COMPRA_CLIENTE_1 FOREIGN KEY (idcliente) REFERENCES CLIENTE (idcliente),CONSTRAINT fk_COMPRA_DETALLECOMPRA_1 FOREIGN KEY (idcompra) REFERENCES DETALLECOMPRA (idcompra))")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}