package mx.edu.ittepic.tpdm_u2_practica2_15400998

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main3Activity : AppCompatActivity() {
    var bdAlmacen = TablaAlmacen(this,"practica2",null,1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
}
