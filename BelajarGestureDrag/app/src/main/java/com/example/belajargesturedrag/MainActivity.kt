package com.example.belajargesturedrag

import android.os.Bundle
import android.content.ClipData
import android.content.ClipDescription
import android.os.Build
import android.view.DragEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llAtas.setOnDragListener(dragListener)
        llBawah.setOnDragListener(dragListener)

        vGeser.setOnLongClickListener {
            val clipTeks = "Kotak berpindah"
            val item = ClipData.Item(clipTeks)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipTeks, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it,0)
            it.visibility = View.INVISIBLE
            true
        }
    }
    val dragListener = View.OnDragListener { view, event ->

        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                Toast.makeText(this,"Mulai Drag",Toast.LENGTH_SHORT).show()
                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_LOCATION -> true
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val item = event.clipData.getItemAt(0)
                val dragData = item.text
                Toast.makeText(this,dragData,Toast.LENGTH_SHORT).show()

                view.invalidate()

                val v = event.localState as View
                val owner = v.parent as ViewGroup
                owner.removeView(v)
                val dest = view as LinearLayout
                dest.addView(v)
                v.visibility = View.VISIBLE
                true
            }
            DragEvent.ACTION_DRAG_ENDED->{
                view.invalidate()
                true
            }
            else -> false
        }
    }
}