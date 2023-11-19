package com.example.proyectofinal


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectofinal.databinding.ActivityIniciarSesionBinding


class IniciarSesion : AppCompatActivity() {

    private lateinit var binding: ActivityIniciarSesionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.EnlaceRegistrarse.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}