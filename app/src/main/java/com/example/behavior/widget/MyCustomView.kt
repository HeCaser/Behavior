package com.example.behavior.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.behavior.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback

/**
 * @author: hepan
 * @date: 2022/4/19
 * @desc: 自定义 View
 */
class MyCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private var behavior: BottomSheetBehavior<FrameLayout>? = null

    private var container: FrameLayout? = null
    private var coordinator: CoordinatorLayout? = null
    private var bottomSheet: FrameLayout? = null

    init {
        LayoutInflater.from(getContext()).inflate(R.layout.framework_bottom_sheet,this,true)

        container = findViewById(R.id.container)
        coordinator = container?.findViewById(com.google.android.material.R.id.coordinator)
        bottomSheet = container?.findViewById(com.google.android.material.R.id.design_bottom_sheet)

        bottomSheet?.apply {
            behavior = BottomSheetBehavior.from(bottomSheet!!)
            // 开启交互
            behavior!!.isHideable = true
        }
        setBehaviorCallback()
        coordinator?.setOnClickListener {
            // 展开 View
            behavior?.state = BottomSheetBehavior.STATE_EXPANDED
        }
    }

    private fun setBehaviorCallback(){
        behavior?.addBottomSheetCallback(object : BottomSheetCallback() {
            override fun onStateChanged(
                bottomSheet: View, @BottomSheetBehavior.State newState: Int
            ) {
                println("hepan state = $newState " )
            }
            override fun onSlide(bottomSheet: View, slideOffset: Float) {}
        })
    }

}