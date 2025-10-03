package org.iesch.ejerciciologin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.ejerciciologin.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inicializamos el binding
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Aquí manejas el botón con ViewBinding
        binding.btnEntrar.setOnClickListener {

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnEntrar.setOnClickListener {
            // Recogemos el email
            val email = binding.etEmail.text.toString()

            // Creamos el Intent y enviamos el email
            val intent = Intent(this, RegisterActivity::class.java).apply {
                putExtra("EMAIL", email)
            }

            // Abrimos la siguiente pantalla
            startActivity(intent)
        }

    }
}
