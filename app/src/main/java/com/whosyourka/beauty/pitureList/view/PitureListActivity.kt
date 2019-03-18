package com.whosyourka.beauty.pitureList.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.whosyourka.beauty.R
import com.whosyourka.beauty.databinding.ActivityPitureListBinding
import com.whosyourka.beauty.pitureList.model.PitureListModle
import com.whosyourka.beauty.pitureList.vm.PitureListVM

class PitureListActivity : AppCompatActivity() {

    val viewModle by lazy { ViewModelProviders.of(this).get(PitureListVM::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_piture_list)

        val binding: ActivityPitureListBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_piture_list)
        var model = PitureListModle()
        model.name = "whosyourka"
        binding.viewmodel = model

        viewModle.showNoData(model)
    }
}

