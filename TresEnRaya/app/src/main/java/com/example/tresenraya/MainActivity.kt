package com.example.tresenraya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tresenraya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var turno = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var turno:Int = 1
        binding.iv1.setOnClickListener{pulsaIm1()}
        binding.iv2.setOnClickListener{pulsaIm2()}
        binding.iv3.setOnClickListener{pulsaIm3()}
        binding.iv4.setOnClickListener{pulsaIm4()}
        binding.iv5.setOnClickListener{pulsaIm5()}
    }

    private fun pulsaIm1() {
        if(turno == 1){
            binding.iv1.setImageResource(R.drawable.cruz)
            binding.iv1.setTag("1")
            binding.iv1.isClickable = false
            if(binding.iv1.tag == binding.iv2.tag == binding.iv3.tag || binding.iv1.tag == binding.iv5.tag == binding.iv9.tag || binding.iv1.tag == binding.iv4.tag == binding.iv8.tag){
                binding.textoganador.text = "Ha ganado el jugador 1"
            }
            turno = 2
        }else{
            binding.iv1.setImageResource(R.drawable.circulo)
            binding.iv1.setTag("2")
            binding.iv1.isClickable = false
            if(binding.iv1.tag == binding.iv2.tag == binding.iv3.tag || binding.iv1.tag == binding.iv5.tag == binding.iv9.tag || binding.iv1.tag == binding.iv4.tag == binding.iv8.tag){
                binding.textoganador.text = "Ha ganado el jugador 2"
            }
            turno = 1
        }

    }
    private fun pulsaIm2() {
        if(turno == 1){
            binding.iv2.setImageResource(R.drawable.cruz)
            binding.iv2.setTag("1")
            binding.iv2.isClickable = false
            if(binding.iv1.tag == binding.iv2.tag == binding.iv3.tag || binding.iv2.tag == binding.iv5.tag == binding.iv8.tag){
                binding.textoganador.text = "Ha ganado el jugador 1"
            }
            turno = 2
        }else{
            binding.iv2.setImageResource(R.drawable.circulo)
            binding.iv2.setTag("2")
            binding.iv2.isClickable = false
            if(binding.iv1.tag == binding.iv2.tag == binding.iv3.tag || binding.iv2.tag == binding.iv5.tag == binding.iv8.tag){
                binding.textoganador.text = "Ha ganado el jugador 2"
            }
            turno = 1
        }
    }
    private fun pulsaIm3() {
        if(turno == 1){
            binding.iv3.setImageResource(R.drawable.cruz)
            binding.iv3.setTag("1")
            binding.iv3.isClickable = false
            if(binding.iv1.tag == binding.iv2.tag == binding.iv3.tag || binding.iv3.tag == binding.iv6.tag == binding.iv9.tag){
                binding.textoganador.text = "Ha ganado el jugador 1"
            }
            turno = 2
        }else{
            binding.iv3.setImageResource(R.drawable.circulo)
            binding.iv3.setTag("2")
            binding.iv3.isClickable = false
            if(binding.iv1.tag == binding.iv2.tag == binding.iv3.tag || binding.iv3.tag == binding.iv6.tag == binding.iv9.tag){
                binding.textoganador.text = "Ha ganado el jugador 2"
            }
            turno = 1
        }
    }
    private fun pulsaIm4() {
        if(turno == 1){
            binding.iv4.setImageResource(R.drawable.cruz)
            binding.iv4.setTag("1")
            binding.iv4.isClickable = false
            if(binding.iv1.tag == binding.iv4.tag == binding.iv7.tag || binding.iv4.tag == binding.iv5.tag == binding.iv6.tag){
                binding.textoganador.text = "Ha ganado el jugador 1"
            }
            turno = 2
        }else{
            binding.iv4.setImageResource(R.drawable.circulo)
            binding.iv4.setTag("2")
            binding.iv4.isClickable = false
            if(binding.iv1.tag == binding.iv4.tag == binding.iv7.tag || binding.iv4.tag == binding.iv5.tag == binding.iv6.tag){
                binding.textoganador.text = "Ha ganado el jugador 2"
            }
            turno = 1
        }
    }
    private fun pulsaIm5() {
        if(turno == 1){
            binding.iv5.setImageResource(R.drawable.cruz)
            binding.iv5.setTag("1")
            binding.iv5.isClickable = false
            if(binding.iv1.tag == binding.iv5.tag == binding.iv9.tag || binding.iv4.tag == binding.iv5.tag == binding.iv6.tag ||  binding.iv2.tag == binding.iv5.tag == binding.iv8.tag ||  binding.iv3.tag == binding.iv5.tag == binding.iv7.tag){
                binding.textoganador.text = "Ha ganado el jugador 1"
            }
            turno = 2
        }else{
            binding.iv5.setImageResource(R.drawable.circulo)
            binding.iv5.setTag("2")
            binding.iv5.isClickable = false
            if(binding.iv1.tag == binding.iv5.tag == binding.iv9.tag || binding.iv4.tag == binding.iv5.tag == binding.iv6.tag ||  binding.iv2.tag == binding.iv5.tag == binding.iv8.tag ||  binding.iv3.tag == binding.iv5.tag == binding.iv7.tag){
                binding.textoganador.text = "Ha ganado el jugador 2"
            }
            turno = 1
        }
    }
}