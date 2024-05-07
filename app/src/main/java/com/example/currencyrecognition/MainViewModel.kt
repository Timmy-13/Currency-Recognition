package com.example.currencyrecognition

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.media.MediaPlayer
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {

    private val _bitmap = MutableStateFlow<Bitmap?>(null)
    val bitmaps = _bitmap.asStateFlow()

    private val _denomination = MutableStateFlow("Currency Recognition")
    val denomination = _denomination.asStateFlow()



    private val labels = arrayOf("10 Rupees", "100 Rupees", "1000 Rupees","20 Rupees","50 Rupees","500 Rupees","5000 Rupees")

    fun onTakePhoto(bitmap: Bitmap) {
        _bitmap.value = bitmap
    }

    fun onMakePrediction(prediction : Int) {
        _denomination.value = labels[prediction]
    }

}