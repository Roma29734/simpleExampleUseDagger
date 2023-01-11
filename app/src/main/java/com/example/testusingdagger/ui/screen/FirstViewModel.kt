package com.example.testusingdagger.ui.screen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.testusingdagger.data.TestRepository
import javax.inject.Inject

class FirstViewModel@Inject constructor(
    private val repository: TestRepository, app: Application
): AndroidViewModel(app) {

    fun getString(): String {
        return "ATAS"
    }
}