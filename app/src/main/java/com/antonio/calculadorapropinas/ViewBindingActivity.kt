package com.antonio.calculadorapropinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.antonio.calculadorapropinas.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class ViewBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonCalcular.setOnClickListener {

            var propina:Double=0.0
            if (binding.maravillosa.isChecked) {
                propina = binding.costeDeServicio.text.toString().toDouble() * 1.20


            }
            if (binding.buena.isChecked) {
                propina = binding.costeDeServicio.text.toString().toDouble() * 1.18

            }
            if (binding.aceptable.isChecked) {
                propina = binding.costeDeServicio.text.toString().toDouble() * 1.15

            }

            if (binding.redondear.isChecked) {
                binding.resultado.text = "${propina.roundToInt()}"
            } else {
                binding.resultado.text = "$propina"
            }



        }
    }
}

