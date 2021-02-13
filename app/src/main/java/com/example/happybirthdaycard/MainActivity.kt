package com.example.happybirthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val background = findViewById<ImageView>(R.id.imageView2)
        background.setImageResource(R.drawable.minimal_yellow_concept_mockup_stone_podium_with_gift_box_ribbon_falling_background_3d_render_74387_200)
        val balloon1 = findViewById<ImageView>(R.id.imageView5)
        balloon1.setImageResource(R.drawable.untitled_design2)
        val balloon2 = findViewById<ImageView>(R.id.imageView6)
        balloon2.setImageResource(R.drawable.untitled_design2)
        val happy = findViewById<TextView>(R.id.textView)
        happy.setText("** Happy Birthday **")
        val from = findViewById<TextView>(R.id.textView2)
        from.setText("From,")
        val sans = findViewById<TextView>(R.id.textView3)
        sans.setText("Sanskruti")
        val name = findViewById<TextView>(R.id.textView4)
        name.setText("Name")
    }
}