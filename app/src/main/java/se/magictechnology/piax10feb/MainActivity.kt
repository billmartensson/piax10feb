package se.magictechnology.piax10feb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import se.magictechnology.piax10feb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        binding.fancyTV.text = "Banan"
        findViewById<TextView>(R.id.fancyTV).text = "Banan"

        binding.changeTextButton.setOnClickListener {
            binding.fancyTV.text = "Apelsin"
        }
    }
}