package ro.pub.cs.systems.eim.practicaltest01var07

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var07SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var07_secondary)

        val firstNumber = intent.getStringExtra("firstNumber")
        val secondNumber = intent.getStringExtra("secondNumber")
        val thirdNumber = intent.getStringExtra("thirdNumber")
        val fourthNumber = intent.getStringExtra("fourthNumber")

        val textView1 = findViewById<TextView>(R.id.text_view_1)
        val textView2 = findViewById<TextView>(R.id.text_view_2)
        val textView3 = findViewById<TextView>(R.id.text_view_3)
        val textView4 = findViewById<TextView>(R.id.text_view_4)

        textView1.text = firstNumber
        textView2.text = secondNumber
        textView3.text = thirdNumber
        textView4.text = fourthNumber
    }
}