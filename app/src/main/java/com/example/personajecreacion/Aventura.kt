package com.example.personajecreacion

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Aventura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aventura)

        val personaje : Personaje? = intent.getParcelableExtra("Personaje",
            Personaje::class.java)
        val dado : ImageButton = findViewById(R.id.dado)

        dado.setOnClickListener{
            var num = (1..4).random()
            val intent:Intent
            when(num){
                1->{
                    intent = Intent(this,Objeto::class.java)
                    startActivity(intent)
                }
                2->{
                    intent = Intent(this,Ciudad::class.java)
                    startActivity(intent)
                }
                3->{
                    intent = Intent(this,Mercader::class.java)
                    startActivity(intent)
                }
                4->{
                    intent = Intent(this,Enemigo::class.java)
                    startActivity(intent)
                }
            }

        }




    }
}