package dev.jimmy.aes_encrption_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var input: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.encrypt)
        input = findViewById(R.id.input)
        button.setOnClickListener {
            val text = input.text.toString()

            val encryptedText = AES_Encryption().encrypt(context = applicationContext,text)
            findViewById<TextView>(R.id.textView).text = encryptedText.toString()

        }


    }
}