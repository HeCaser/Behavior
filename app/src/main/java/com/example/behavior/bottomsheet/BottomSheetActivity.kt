package com.example.behavior.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.behavior.R
import com.example.behavior.widget.MyCustomView

class BottomSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = MyCustomView(this)
        setContentView(view)

    }
}