package com.example.foodwala

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodwala.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {
    private var _binding: ActivityChooseLocationBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = ActivityChooseLocationBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            val locationList = arrayOf("Patuli", "Jadavpur", "Mukandapur", "Kharki")
            val adapter = ArrayAdapter(this@ChooseLocationActivity, android.R.layout.simple_list_item_1, locationList)
            val autoCompleteTextView = binding.listOfLocation
            autoCompleteTextView.setAdapter(adapter)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}