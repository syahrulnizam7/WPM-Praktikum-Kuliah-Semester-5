package com.example.belajarsimplegesture

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener {
    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent): Boolean {
        return true
    }

    override fun onShowPress(p0: MotionEvent) {
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        return true
    }

    override fun onScroll(
        p0: MotionEvent,
        p1: MotionEvent,
        p2: Float,
        p3: Float,
    ): Boolean {
        tx_gestureStatus.text = "Efek Scroll"
        clayout.setBackgroundColor(Color.GREEN)
        return true
    }

    override fun onLongPress(p0: MotionEvent) {
        tx_gestureStatus.text = "Efek Tekan Lama"
        clayout.setBackgroundColor(Color.BLUE)
    }

    override fun onFling(
        p0: MotionEvent,
        p1: MotionEvent,
        p2: Float,
        p3: Float,
    ): Boolean {
        tx_gestureStatus.text = "Efek Fling"
        clayout.setBackgroundColor(Color.MAGENTA)
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        tx_gestureStatus.text = "Efek Tekan Sekali"
        clayout.setBackgroundColor(Color.GRAY)
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        tx_gestureStatus.text = "Efek Tekan Dua Kali"
        clayout.setBackgroundColor(Color.RED)
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        return true
    }


}