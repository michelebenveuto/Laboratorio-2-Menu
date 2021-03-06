package com.example.hp.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showMenu(view: View){
        val intent: Intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
    fun showOrder(view: View){
        val intent: Intent = Intent(this, PedidoActivity::class.java)
        startActivity(intent)
    }
}
