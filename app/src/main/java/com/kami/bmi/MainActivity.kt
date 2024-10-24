package com.kami.bmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.kami.bmi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
//	private lateinit var binding: ResultProfileBinding
	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		enableEdgeToEdge()
		setContentView(binding.root)
		
		val bmiCalculator: Button = binding.firstActivityButton


		bmiCalculator.setOnClickListener { _ ->
			// Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
			// the components you are targeting. Intent to start an activity called SecondActivity with the following code.
			val intent = Intent(this@MainActivity, BMI_calculator::class.java)

			// start the activity connect to the specified class
			startActivity(intent)
		}
	}
}