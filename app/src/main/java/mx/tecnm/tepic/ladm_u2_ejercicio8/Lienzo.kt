package mx.tecnm.tepic.ladm_u2_ejercicio8

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo(este : MainActivity) : View(este) {
    var este = este
    var img1 = BitmapFactory.decodeResource(este.resources,R.drawable.icono1) //64p
    var img2 = BitmapFactory.decodeResource(este.resources,R.drawable.icono3) //64p


    override fun onDraw(c: Canvas) {//Cuándo se coloca ? significa que puede ser nulo !! para utilizarlo
        super.onDraw(c)
        var p = Paint()
        var im= Imagen(400f,400f,img1)
        c.drawBitmap(img1,400f,400f,p)
        c.drawBitmap(img1,500f,400f,p)


    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        event.x //el X del toque
        event.y //el Y del toque

        when(event.action) { // PRESIONE, ARRASTRANDO, SOLTE
            MotionEvent.ACTION_DOWN->{
                if(x>400 && x <464){
                    if (y>400 && y<464){

                    }
                }

            }
            MotionEvent.ACTION_MOVE->{

            }
            MotionEvent.ACTION_UP->{

            }
        }
        return true

    }
}
