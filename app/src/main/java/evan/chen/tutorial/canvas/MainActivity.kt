package evan.chen.tutorial.canvas

import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private val bitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun drawArc(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawArc)
        startActivity(intent)
    }

    fun drawCircle(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawCircle)
        startActivity(intent)
    }

    fun drawLine(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawLine)
        startActivity(intent)
    }

    fun drawOval(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawOval)
        startActivity(intent)
    }

    fun drawPath(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawPath)
        startActivity(intent)
    }

    fun drawPoint(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawPoint)
        startActivity(intent)
    }

    fun drawRect(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawRect)
        startActivity(intent)
    }

    fun drawRoundRect(view: View) {
        val intent = Intent(this, ImageActivity::class.java)
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawRoundRect)
        startActivity(intent)
    }

}
