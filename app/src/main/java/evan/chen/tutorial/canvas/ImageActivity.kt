package evan.chen.tutorial.canvas

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import evan.chen.tutorial.canvas.R
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity : AppCompatActivity() {

    private var canvasType: CanvasType? = null
    private var bitmap: Bitmap? = null

    enum class CanvasType {
        DrawArc, DrawCircle, DrawOval, DrawLine, DrawPoint, DrawRect, DrawRoundRect, DrawPath
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        this.canvasType = intent.getSerializableExtra("CanvasType") as CanvasType

        this.bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        imageView.setBackgroundColor(Color.LTGRAY)

        when (this.canvasType) {
            ImageActivity.CanvasType.DrawArc -> {
                this.drawArc()
                this.title = "DrawArc"
            }
            ImageActivity.CanvasType.DrawCircle -> {
                this.drawCircle()
                this.title = "DrawCircle"
            }
            ImageActivity.CanvasType.DrawOval -> {
                this.drawOval()
                this.title = "DrawOval"
            }
            ImageActivity.CanvasType.DrawLine -> {
                this.drawLine()
                this.title = "DrawLine"
            }
            ImageActivity.CanvasType.DrawPoint -> {
                this.drawPoints()
                this.title = "DrawPoints"
            }
            ImageActivity.CanvasType.DrawRect -> {
                this.drawRect()
                this.title = "DrawRect"
            }
            ImageActivity.CanvasType.DrawRoundRect -> {
                this.drawRoundRect()
                this.title = "DrawRoundRect"
            }
            ImageActivity.CanvasType.DrawPath -> {
                this.drawPath()
                this.title = "DrawPath"
            }
        }

        imageView.setImageBitmap(bitmap)

    }

    private fun drawCircle() {
        val p = Paint()
        p.strokeWidth = 3f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)
        canvas.drawCircle(240f, 240f, 150f, p)
    }

    private fun drawOval() {
        val p = Paint()
        p.strokeWidth = 10f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)

        val oval = RectF()
        oval.left = 100f
        oval.top = 100f
        oval.right = 400f
        oval.bottom = 300f
        canvas.drawOval(oval, p)
    }

    private fun drawLine() {
        val p = Paint()
        p.strokeWidth = 10f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)

        canvas.drawLine(60f, 40f, 200f, 400f, p)
    }

    private fun drawPoints() {

        val p = Paint()
        p.strokeWidth = 20f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)

        canvas.drawPoint(60f, 390f, p)
        canvas.drawPoints(floatArrayOf(60f, 300f, 100f, 300f, 200f, 300f), p)
    }

    private fun drawRoundRect() {
        val p = Paint()
        p.strokeWidth = 2f
        p.color = Color.RED
        p.style = Paint.Style.FILL
        p.isAntiAlias = true

        val canvas = Canvas(bitmap!!)

        val rect = RectF(100f, 50f, 300f, 500f)
        canvas.drawRoundRect(rect, 20f, 20f, p)
    }

    private fun drawRect() {
        val p = Paint()
        p.strokeWidth = 2f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)

        val rect = RectF(100f, 100f, 400f, 400f)
        canvas.drawRect(rect, p)
    }

    private fun drawPath() {

        val p = Paint()
        p.strokeWidth = 5f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)

        val path = Path()
        path.moveTo(200f, 200f)
        path.lineTo(400f, 200f)
        path.lineTo(400f, 400f)
        path.close()
        canvas.drawPath(path, p)
    }

    private fun drawArc() {
        val p = Paint()
        p.strokeWidth = 2f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)

        val oval1 = RectF(100f, 100f, 400f, 400f)
        canvas.drawArc(oval1, 30f, 300f, true, p)
    }
}
