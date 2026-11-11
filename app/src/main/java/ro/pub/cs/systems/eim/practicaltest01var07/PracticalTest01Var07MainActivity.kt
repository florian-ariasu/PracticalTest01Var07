package ro.pub.cs.systems.eim.practicaltest01var07

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var07MainActivity : AppCompatActivity() {
    private lateinit var setButton: Button
    private lateinit var randomButton: Button

    private lateinit var firstNumber: EditText
    private lateinit var secondNumber: EditText
    private lateinit var thirdNumber: EditText
    private lateinit var fourthNumber: EditText

    private lateinit var secondaryActivityLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var07_main)

        setButton = findViewById(R.id.button_1)
        randomButton = findViewById(R.id.button_2)

        firstNumber = findViewById(R.id.edit_text_1)
        secondNumber = findViewById(R.id.edit_text_2)
        thirdNumber = findViewById(R.id.edit_text_3)
        fourthNumber = findViewById(R.id.edit_text_4)

        randomButton.setOnClickListener {
//            if (firstNumber.text.contains("0")) {
//                firstNumber.setText((1..10).random().toString())
//            }

            firstNumber.setText((1..10).random().toString())

//            if (secondNumber.text.contains("0")) {
//                secondNumber.setText((1..10).random().toString())
//            }

            secondNumber.setText((1..10).random().toString())

//            if (thirdNumber.text.contains("0")) {
//                thirdNumber.setText((1..10).random().toString())
//            }

            thirdNumber.setText((1..10).random().toString())

//            if (fourthNumber.text.contains("0")) {
//                fourthNumber.setText((1..10).random().toString())
//            }

            fourthNumber.setText((1..10).random().toString())
        }

        setButton.setOnClickListener {
            val intent = Intent(
                this,
                PracticalTest01Var07SecondaryActivity::class.java
            )

//            intent.putExtra(
//                PracticalTest01Var07SecondaryActivity.TOTAL_ACCESSES,
//                firstCounter + secondCounter
//            )

            secondaryActivityLauncher.launch(intent)
        }
    }
}