package com.example.profile

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val profile=findViewById<CardView>(R.id.card_view_profile)
        val work=findViewById<CardView>(R.id.card_view_work)
        val skill=findViewById<CardView>(R.id.card_view_Skill)
        val education=findViewById<CardView>(R.id.card_view_education)
        val hobby=findViewById<CardView>(R.id.card_view_hobby)
        val portfolio=findViewById<CardView>(R.id.card_view_achievement)


        profile.setOnClickListener{
            intent=Intent(this,Profile2::class.java)
            startActivity(intent)

        }
        work.setOnClickListener{
            intent=Intent(this,Work::class.java)
            startActivity(intent)

        }
        skill.setOnClickListener{
            intent=Intent(this,Skills::class.java)
            startActivity(intent)

        }
        education.setOnClickListener{
            intent=Intent(this,Education::class.java)
            startActivity(intent)

        }
        hobby.setOnClickListener{
            intent=Intent(this,Hobby::class.java)
            startActivity(intent)

        }
        portfolio.setOnClickListener{
            intent=Intent(this,Portfolio::class.java)
            startActivity(intent)

        }



    }
}