package com.example.sem6project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.sem6project.R
import com.example.sem6project.databinding.ActivityShoppingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityShoppingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    val navController = findNavController(R.id.shoppinghostfragment)
    binding.bottomnavigation.setupWithNavController(navController)
    }
}