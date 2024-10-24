package com.kami.bmi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kami.bmi.databinding.ActivityBmiCalculatorBinding

class BMI_calculator : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		val binding: ActivityBmiCalculatorBinding = ActivityBmiCalculatorBinding.inflate(layoutInflater)
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(binding.root)
		ViewCompat.setOnApplyWindowInsetsListener(
			binding.main
		) { v: View, insets: WindowInsetsCompat ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
	}
}