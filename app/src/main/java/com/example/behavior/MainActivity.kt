package com.example.behavior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.behavior.bottomsheet.MyBottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.tvGoTest).setOnClickListener { goTest() }
        goTest()
    }

    private fun goTest() {
//        startActivity(Intent(this, BottomSheetActivity::class.java))
        showBottomSheetDialog()
    }


    private fun showBottomSheetDialog(){
        MyBottomSheetDialog(this,0).show()
    }
}