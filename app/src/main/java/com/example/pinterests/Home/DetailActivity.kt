package com.example.pinterests.Home

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.pinterests.R

class DetailActivity : AppCompatActivity() {
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        val imageResId = intent.getIntExtra("image", 0)
        val imageView : ImageView = findViewById(R.id.detail_image)
        imageView.setImageResource(imageResId)


        /*setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
*/



        val imageFavorite : ImageView = findViewById(R.id.image_favorite)
        val textFavorite : TextView = findViewById(R.id.text_favorite)

        imageFavorite.setOnClickListener {
            clickCount += 1
            textFavorite.text = clickCount.toString()
            imageFavorite.setColorFilter(ContextCompat.getColor(this,R.color.Red))
        }

        /*if (imageFavorite.colorFilter != null) {
            clickCount--
        }else{
            imageFavorite.setColorFilter(ContextCompat.getColor(this,R.color.Red))
            clickCount++
        }
        textFavorite.text = clickCount.toString()*/

        /*imageFavorite.setOnClickListener{
            if(imageFavorite.colorFilter != null){
                imageFavorite.setColorFilter(ContextCompat.getColor(this,R.color.Red))
                clickCount++

            }else{

                clickCount--

            }
            textFavorite.text = clickCount.toString()

        }*/
    }
}