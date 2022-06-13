package com.example.shutthebox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shutthebox.databinding.ActivityGameAcitivityBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameAcitivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGameAcitivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}