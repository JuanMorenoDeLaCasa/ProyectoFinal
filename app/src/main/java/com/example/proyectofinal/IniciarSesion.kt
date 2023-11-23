package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectofinal.databinding.ActivityIniciarSesionBinding
import java.security.Principal

class IniciarSesion : AppCompatActivity() {

    private lateinit var binding: ActivityIniciarSesionBinding

    // Definir constantes de usuario y contraseña
    private val MYEMAIL = "correo"
    private val MYPASS = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.EnlaceRegistrarse.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        // Agregar lógica de comprobación al hacer clic en el botón Validar
        binding.BotonIniciarSesion.setOnClickListener {
            val contraseña = binding.CampoContraseA.text.toString()
            val email = binding.CampoEmailIniciarSesion.text.toString()


            // Comprobar usuario y contraseña
            if (email == MYEMAIL && contraseña == MYPASS) {
                // Si la validación es correcta, iniciar el Activity principal
                val intent = Intent(this, Principal::class.java)
                startActivity(intent)
            } else {
                // Si la validación no es correcta, mostrar un Toast informando al usuario
                Toast.makeText(
                    this,
                    "Email o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
