package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.profile.databinding.ActivityPortfolioBinding

class Portfolio : AppCompatActivity() {
    private lateinit var binding:ActivityPortfolioBinding

    private var listTheCategories= arrayListOf<portfolio_data_class>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPortfolioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listTheCategories.add(portfolio_data_class("Getting started app","A default hello world app.",R.drawable.smartphone))
        listTheCategories.add(portfolio_data_class("Calculator","A calculation app for basic operator of two numbers.",R.drawable.calculator))
        listTheCategories.add(portfolio_data_class("The Hungry Developer","A basic food menu app consist of starters,main course and dessert using List view and Intents .",R.drawable.restaurant))
        listTheCategories.add(portfolio_data_class("My Bucket List","A list of human fantasy using card view. ",R.drawable.wishlist))
        listTheCategories.add(portfolio_data_class("Record Keeper","App which records your running and cycling data opf various forms within fragments.",R.drawable.folder))
        listTheCategories.add(portfolio_data_class("Registration Form","A app which sends the requires info to the desired destination.",R.drawable.google_forms))
        listTheCategories.add(portfolio_data_class("Smile Detector","An app which express the your smile into percentage using Ml kit.",R.drawable.laughing))
        listTheCategories.add(portfolio_data_class("Profile","App which describe myself in briefly. ",R.drawable.portfolio))


        binding.recyclerViewProjects.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerViewProjects.adapter=portfolioAdapter(this,listTheCategories)


    }
}