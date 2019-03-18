package com.whosyourka.beauty.pitureList.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.whosyourka.beauty.R
import com.whosyourka.beauty.databinding.ActivityPitureListBinding
import com.whosyourka.beauty.pitureList.model.ViewModel

class PitureListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_piture_list)

        val binding: ActivityPitureListBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_piture_list)
        var model = ViewModel("whosyourka1")
        binding.viewmodel = model
    }
}
