package com.example.behavior.bottomsheet

import android.content.Context
import android.os.Bundle
import com.example.behavior.R
import com.google.android.material.bottomsheet.BottomSheetDialog

/**
 * @author: hepan
 * @date: 2022/4/19
 * @desc: 最简单的使用, BottomSheetDialog 内部利用 BottomSheetBehavior 实现交互动画
 */

class MyBottomSheetDialog(context: Context, style: Int = 0) : BottomSheetDialog(context, style) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.view_item)
    }

}