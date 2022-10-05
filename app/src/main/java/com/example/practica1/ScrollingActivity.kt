package com.example.practica1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.practica1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.include.btn1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Emilia_Mernes"))
            startActivity(i)
        }
        binding.include.btn2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Duki"))
            startActivity(i)
        }
        binding.include.btn3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bizarrap"))
            startActivity(i)
        }
        binding.include.btn4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bad_Bunny"))
            startActivity(i)
        }
        Glide.with(this)
            .load("https://los40.com/los40/imagenes/2022/05/05/los40urban/1651749493_468880_1651749600_gigante_normal.jpg")
            .centerCrop()
            .into(binding.include.img1!!)

        Glide.with(this)
            .load("https://s3.amazonaws.com/arc-wordpress-client-uploads/infobae-wp/wp-content/uploads/2018/11/09110315/Duki.jpg")
            .centerCrop()
            .into(binding.include.img2!!)

        Glide.with(this)
            .load("https://cloudfront-eu-central-1.images.arcpublishing.com/larazon/GE33DP2D35AOHBPCM5CPZ65BAY.jpg")
            .centerCrop()
            .into(binding.include.img3!!)

        Glide.with(this)
            .load("https://imagenes.elpais.com/resizer/E_KcJgzuNbS83TiWLfAkEY6BjGk=/1960x1103/cloudfront-eu-central-1.images.arcpublishing.com/prisa/ZUQQ4HPORKWVOA6TER73RPXFIA.jpg")
            .centerCrop()
            .into(binding.include.img4!!)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}