package mx.tecnm.tepic.ladm_u2_ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(this))
    }
    /*
    imagen x,y imagen BITMAPFACTORY
    - método estaEnArea = SiTocoImagen = down
    - método arastrar = move
     */
}