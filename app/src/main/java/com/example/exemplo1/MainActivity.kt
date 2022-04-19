package com.example.exemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.StructMsghdr
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_message.setOnClickListener() {
            val msg = Edit_mensagem.text.toString()
        TV_resultado.text = msg
        }
    }
}
