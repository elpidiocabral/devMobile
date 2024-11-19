package com.example.profileappfera

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando componentes
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)
        // Definindo informações de perfil
        nameText.text = "Marcero"
        descriptionText.text = "Desenvolvedor de software com problemas de dicção."
        currentJobText.text = "Emprego Atual: Barman"

        // Lista de experiências
        val experiencias = listOf(
            "Analista de Ciências - Empresa A",
            "Cornológo - Empresa B",
            "Provador de Identidades - Empresa C"
        )

        // Adicionando experiências dinamicamente
        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }

        profileImage.setOnClickListener {
            Toast.makeText(this, "Foto de perfil de Marcero", Toast.LENGTH_SHORT).show()
        }

    }
}
