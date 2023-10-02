package com.example.travelbooking

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTSt: Button =findViewById(R.id.btnTst)
        val btnInt: Button =findViewById(R.id.btnInt)


        btnTSt.setOnClickListener{
            Toast.makeText(this, "Booking Confirmed",Toast.LENGTH_LONG).show()
        }
        btnInt.setOnClickListener {
            val intent = Intent(this,DestinationdetailsActivity::class.java)
            startActivity(intent)
        }
    }
}