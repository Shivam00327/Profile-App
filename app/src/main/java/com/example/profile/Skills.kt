package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.profile.R.id.text_view_item_1
import com.example.profile.databinding.ActivitySkillsBinding

class Skills : AppCompatActivity() {
    private lateinit var binding:ActivitySkillsBinding
    var list= arrayListOf<data_class1>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySkillsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.add(data_class1("Java"))
        list.add(data_class1("Kotlin"))
        list.add(data_class1("MYSQL"))

        binding.recyclerViewProject.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerViewProject.adapter=rcvAdapter(this,list)



    }
}